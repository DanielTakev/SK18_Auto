package lecture13.demo;

public class Person {

    private final String name;
    private final String sex;
    private final String religion;
    private final String language;
    private final String nationality;
    private final int egn;
    private final int dateOfBirth;
    private final int age;
    private String job;
    private String country;

    public Person(String name, String sex, String religion,
                  String language, String job, String nationality,
                  int egn, int dateOfBirth, int age, String country) {

        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.egn = egn;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getReligion() {
        return religion;
    }

    public String getLanguage() {
        return language;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getNationality() {
        return nationality;
    }

    public int getEgn() {
        return egn;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
