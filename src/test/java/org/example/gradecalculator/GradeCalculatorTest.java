package org.example.gradecalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;


/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수*교과목 평점)의 합계/수강신청 총학점 수
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    // 학점 계산기 도메인: 이수한 과목, 학점 계산
    // 객체지향 프로그래밍, 자료구조, 과목 클래

    // 이수한 과목을 전달하여 평균학점 계산 요청 ---> 학점 계산 ---> (학점수*교과목 평점)의 합계 ---> 과목(코스)

    @ParameterizedTest
    @MethodSource("성적_목록")
    void 평균학점계산(Courses courses, double result) {
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(result);
    }

    static Stream<Arguments> 성적_목록() {
        return Stream.of(
                arguments(new Courses(List.of(new Course("OOP", 3, Grade.GRADE_A_PLUS), new Course("자료구조", 3, Grade.GRADE_A_PLUS))), 4.5),
                arguments(new Courses(List.of(new Course("OOP", 1, Grade.GRADE_B_PLUS), new Course("자료구조", 3, Grade.GRADE_A_PLUS))), 4.25),
                arguments(new Courses(List.of(new Course("OOP", 2, Grade.GRADE_C_PLUS), new Course("자료구조", 3, Grade.GRADE_A_PLUS))), 3.7)
        );
    }
}
