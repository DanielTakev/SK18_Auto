package lecture07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Examples {

    public static void main(String[] args) {
        testHashSetOperations();
    }

    public static void testHashMapEntrySet() {
        // Creating HashMap
        HashMap<Integer, String> peshoMap = new HashMap<>();

        // Put elements in Map
        peshoMap.put(1, "Mango");
        peshoMap.put(2, "Apple");
        peshoMap.put(3, "Banana");
        peshoMap.put(4, "Grapes");

        System.out.println("Iterating Hashmap...");
        // An Entry set returns key-value pairs
        // You get BOTH the key and value directly from the Map. Entry object using fruit.getKey() and fruit.getValue().
        for (Map.Entry<Integer, String> fruit : peshoMap.entrySet()) {
            System.out.println(fruit.getKey() + " => " + fruit.getValue());
        }
    }

    public static void testHashMapKeySet() {
        // Creating HashMap
        HashMap<Integer, String> myMap = new HashMap<>();

        // Put elements in Map
        myMap.put(122232323, "Mango");
        myMap.put(23423, "Apple");
        myMap.put(13, "Banana");
        myMap.put(4, "Grapes");
        // A key set returns all keys of the myMap
        // The value is retrieved using myMap.get(key) for each key only.
        for (Integer key : myMap.keySet()) {
            System.out.println(key + " " + myMap.get(key));
        }
    }

    public static void testHashMapOperations() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "Ivan");
        hashMap.put(101, "Georgi");
        hashMap.put(102, "Stoyan");
        System.out.println("Initial list of elements: ");

        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getValue());
        }

        System.out.println("Updated list of elements: ");
        hashMap.replace(102, "Miroslav"); // replaces the value of a specified key
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }

        System.out.println("Updated list of elements:");
        // Replace the old value of the specified key only if the key is previously mapped with the specified old value
        hashMap.replace(101, "Georgi", "Anton");
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }

        System.out.println("Updated list of elements:");
        // Replaces the values of all keys
        hashMap.replaceAll((k, v) -> "Asen");
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }

    public static void testHashMapOperations2() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ivan", 88581234);
        hashMap.put("Dani", 1234);
        hashMap.put("Pesho", 5421);
        hashMap.put("Pesho2", 54231);
        System.out.println("Initial list of elements: ");

        for (Map.Entry<String, Integer> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " => " + name.getValue());
        }

        System.out.println("Updated list of elements:");
        // Replace the old value of the specified key only if the key is previously mapped with the specified old value
        hashMap.replace("Pesho", 5421, 9999);
        for (Map.Entry<String, Integer> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }

    public static void testHashSetForEach() {
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("One");
        myHashSet.add("Two");
        myHashSet.add("Three");
        myHashSet.add("Four");
        myHashSet.add("Five");
        myHashSet.add("Two");
        myHashSet.add("Two");
        myHashSet.add("Two");

        for (String number : myHashSet) {
            System.out.println(number);
        }
        System.out.println(myHashSet.size());
    }

    public static void testHashSetOperations() {
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Niki");
        myHashSet.add("Ivan");
        myHashSet.add("Georgi");
        myHashSet.add("Stoyan");
        System.out.println("An initial list of elements: " + myHashSet);

        //Removing specific element from HashSet
        myHashSet.remove("Ivan");
        System.out.println("After invoking remove(object) method: " + myHashSet);

        HashSet<String> myHasSetWomen = new HashSet<>();
        myHasSetWomen.add("Ekaterina");
        myHasSetWomen.add("Maya");
        myHashSet.addAll(myHasSetWomen);
        System.out.println("Updated List: " + myHashSet);

        // Removing all the new elements from HashSet
        myHashSet.removeAll(myHasSetWomen);
        System.out.println("After invoking removeAll() method: " + myHashSet);

        // Removing elements on the basis of specified condition
        myHashSet.removeIf(str -> str.contains("Nik"));
        System.out.println("After invoking removeIf() method: " + myHashSet);

        // Removing all the elements available in the myHashSet
        myHashSet.clear();
        System.out.println("After invoking clear() method: " + myHashSet);
    }
}
