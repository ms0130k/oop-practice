package org.example.gradecalculator;

public class Course {
    private final String subject;
    private final int credit;
    private final Grade grade;

    public Course(final String subject, final int credit, final Grade grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getCredit() {
        return credit;
    }

    public Grade getGrade() {
        return grade;
    }

    public double getGradeToNumber() {
        return grade.getNumber();
    }

    public double getMultipliedCreditAndCourseGrade() {
        return credit * getGradeToNumber();
    }
}
