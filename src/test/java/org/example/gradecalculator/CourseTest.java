package org.example.gradecalculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class CourseTest {
    @Test
    void 과목생성() {
        assertThatCode(() -> new Course("OOP", 3, Grade.GRADE_A_PLUS)).doesNotThrowAnyException();
    }

}
