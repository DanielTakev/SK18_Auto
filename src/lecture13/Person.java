package lecture13;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Person {
    private final String name;
    private final String sex;
    private final String religion;
    private final String languageSpoken;
    private final String nationality;
    private final String EGN;
    private final LocalDate dateOfBirth;
    private final int age;
    private String job;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String languageSpoken, String job, String nationality, String EGN, String countryOfResidence) {
        if (!isValidEGN(EGN)) {
            throw new IllegalArgumentException("Invalid EGN");
        }
        if (!isValidSex(sex)) {
            System.out.println("Invalid sex provided. Continuing execution.");
        }

        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.EGN = EGN;
        this.dateOfBirth = calculateDateOfBirth(EGN);
        this.age = calculateAge(this.dateOfBirth);
        this.countryOfResidence = countryOfResidence;
    }

    private boolean isValidEGN(String EGN) {
        if (EGN == null || EGN.length() != 10) {
            return false;
        }
        try {
            Long.parseLong(EGN);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidSex(String sex) {
        return "male".equalsIgnoreCase(sex) || "female".equalsIgnoreCase(sex);
    }

    private LocalDate calculateDateOfBirth(String EGN) {
        String dateOfBirth = EGN.substring(0, 6);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd");
        LocalDate parsedDate = LocalDate.parse(dateOfBirth, formatter);

        // Adjust the year to be in the range 1900-1999
        if (parsedDate.getYear() > LocalDate.now().getYear()) {
            parsedDate = parsedDate.minusYears(100);
        }
        return parsedDate;
    }

    private int calculateAge(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public abstract void sayHello();

    public void celebrateEaster() {
        if (religion.equalsIgnoreCase("orthodox") || religion.equalsIgnoreCase("catholic")) {
            System.out.println("I am celebrating Easter");
        } else {
            System.out.println("I am not celebrating Easter");
        }
    }

    public boolean isAdult() {
        switch (countryOfResidence) {
            case "Bulgaria":
            case "Italy":
                return age >= 18;
            case "USA":
                return age >= 21;
            default:
                throw new RuntimeException("We don't have information about country: " + countryOfResidence);
        }
    }

    public boolean canTakeLoan() {
        return job != null && !job.isEmpty();
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

    public String getLanguageSpoken() {
        return languageSpoken;
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

    public String getEGN() {
        return EGN;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }
}