package org.launchcode.java.exercises.ChapterFour;

public class Teacher {
    private String firstName, lastName, subject;
    private Integer yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, Integer yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(Integer yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
