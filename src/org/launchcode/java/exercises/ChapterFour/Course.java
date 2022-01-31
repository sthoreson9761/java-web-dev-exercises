package org.launchcode.java.exercises.ChapterFour;

import java.util.ArrayList;

public class Course {
    private Student student;
    private Teacher teach;
    private ArrayList<Student> classList;
    private String courseTitle;

    public Course(Student student, Teacher teach, ArrayList<Student> classList, String courseTitle) {
        this.student = student;
        this.teach = teach;
        this.classList = classList;
        this.courseTitle = courseTitle;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeach() {
        return teach;
    }

    public void setTeach(Teacher teach) {
        this.teach = teach;
    }

    public ArrayList<Student> getClassList() {
        return classList;
    }

    public void setClassList(ArrayList<Student> classList) {
        this.classList = classList;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
}
