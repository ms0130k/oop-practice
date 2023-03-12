package org.example.foodorder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 음식점에서 음식 주문하는 과정 구현
 * 요구사항
 * 1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
 *      ㄴ 손님, 메뉴판, 돈가스, 만두, 요리사, 요리
 * 2. 객체들 간의 관계를 고민
 *      ㄴ 손님 -- 메뉴판
 *      ㄴ 손님 -- 요리사
 *      ㄴ 요리사 -- 요리
 * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
 *      ㄴ 손님 -- 손님 타입
 *      ㄴ 돈가스/냉면/만두 -- 요리 타입
 *      ㄴ 메뉴판 -- 메뉴판 타입
 *      ㄴ 메뉴 -- 메뉴 타입
 *      ㄴ 요리 -- 요리 타입
 * 4. 협력들 설계
 * 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
 * 6. 구현하기
 */
public class CustomerTest {
    @Test
    void 요리_주문() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈가스", 5000), new MenuItem("만두", 7000), new MenuItem("냉면", 2000)));
        assertThatCode(() -> customer.order("돈가스", menu, new Chef()))
                .doesNotThrowAnyException();

    }
}
