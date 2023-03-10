package org.example.gradecalculator;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(final List<Course> courses) {
        this.courses = courses;
    }

    public double getMultipliedCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(c -> c.getCredit() * c.getGradeToNumber())
                .sum();
    }

    public int getTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
