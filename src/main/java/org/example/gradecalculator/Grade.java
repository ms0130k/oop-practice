package org.example.gradecalculator;

public enum Grade {
    GRADE_A_PLUS("A+", 4.5),
    GRADE_A("A", 4.0),
    GRADE_B_PLUS("B+", 3.5),
    GRADE_B("B", 3.0),
    GRADE_C_PLUS("C+", 2.5),
    GRADE_C("C", 2.0);

    private String grade;
    private double number;

    Grade(final String grade, final double number) {
        this.grade = grade;
        this.number = number;
    }

    public String getGrade() {
        return grade;
    }

    public double getNumber() {
        return number;
    }
}
