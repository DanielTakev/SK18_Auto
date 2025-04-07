package lecture10.examples;

import java.io.*;

public class Examples {
    public static void main(String[] args) throws IOException {
//        testTryMultipleCatch(100, 0);

//        testThrowException(100, 0);
//        testUncheckedException();
//        testTryCatch("src/lecture10/examples/testFileДД.txt");
        testTryFinally("src/lecture10/examples/testFile.txt");

    }

    static void testCheckedException() throws FileNotFoundException {
        File file = new File("src/lecture10/examples/testFile.txt");
        FileReader fr = new FileReader(file);
        System.out.println(fr.getEncoding());
    }

















    static void testUncheckedException() {
        int[] num = {0, 1, 2, 3, 4};
        System.out.println(num[5]);
    }












    /**
     * @param path example:
     * "src/lecture10/examples/testFile.txt"
     */
    static void testTryCatch(String path) {
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException myException) {
            System.out.println("SUCCESS!!!!!!!");
//            myException.printStackTrace();
        }
    }











    /**
     * Този метод `testTryMultipleCatch` приема два цели числа: `number` и `factor`.
     * Той демонстрира обработка на изключения чрез няколко `catch` блока.
     * **Вътре в `try` блока:**
     * - Първо се проверява дали `factor` дели `number` без остатък и ако е така, се отпечатва съобщение.
     * - След това умишлено се предизвиква `NumberFormatException`, като се опитва да се парсне низът `"not_a_number"`
     * като цяло число.
     *
     * **`catch` блокове:**
     * - Ако делението предизвика грешка (например делене на нула), се улавя `ArithmeticException`.
     * - Ако парсването на низа се провали (което винаги ще се случи тук), се улавя `NumberFormatException` и се отпечатва.
     *
     * @param number ex: 100, 99, 99, 10
     * @param factor ex: 10, 5, 0, "test"
     */
    static void testTryMultipleCatch(int number, int factor) {
        try {
            if (number % factor == 0) {
                System.out.println(factor + " is a factor of " + number);
            }
            // Force a NumberFormatException
//            Integer.parseInt("11");
//            System.out.println(Integer.parseInt("11"));
            Integer.parseInt("not a number-it's a String");

        } catch (ArithmeticException myArithmeticException) {
            System.out.println("Arithmetic " + myArithmeticException);
        } catch (NumberFormatException myNumberFormatException) {
            System.out.println("Number Format Exception " + myNumberFormatException);
        }
    }

    /**
     * @param number ex: 100, 99, 99, 10
     * @param factor ex: 10, 5, 0, "test"
     */
    static void testTryCatchMultipleExceptions(int number, int factor) {
        try {
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException | NumberFormatException ex) {
            System.out.println("Exception encountered " + ex);
        }
    }

    /**
     * @param path example:
     *             "src/lecture10/examples/testFile.txt"
     */
    static void testThrowsException(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader fileReader;
        fileReader = new FileReader(file);
    }






    /**
     * @param number ex: 100, 99, 99, 10
     * @param factor ex: 10, 5, 0, "test"
     */
    static void testThrowException(int number, int factor) {
        try {
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException | NumberFormatException ex) {
            System.out.println("ERROR!");
            throw new IllegalArgumentException("Incorrect input! Please enter only numbers bigger than 0!");
        }
    }














    static void testTryFinally(String path) throws IOException {
        FileInputStream myFileInputStream = null;
        BufferedReader myBuffReader = null;
        try {
            myFileInputStream = new FileInputStream(path);
            myBuffReader = new BufferedReader(new InputStreamReader(myFileInputStream));
            String temp;

            while ((temp = myBuffReader.readLine()) != null) {
                System.out.println(temp);
            }
        } finally {
            if (myBuffReader != null) {
                myBuffReader.close();
            }
            if (myFileInputStream != null) {
                myFileInputStream.close();
            }
            System.out.println("FINALLY");
        }
    }
}