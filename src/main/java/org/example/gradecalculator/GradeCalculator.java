package org.example.gradecalculator;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(final Courses courses) {
        this.courses = courses;
    }

    public double calculateGrade() {
        double multipliedCreditAndCourseGrade = courses.getMultipliedCreditAndCourseGrade();
        int totalCompletedCredit = courses.getTotalCompletedCredit();
        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }

}
