package plus.problem2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderAnalysis {
    public static void main(String[] args) {
        // 제품 목록 생성
        Product laptop = new Product("노트북", "전자제품", 1200000);
        Product phone = new Product("스마트폰", "전자제품", 800000);
        Product book = new Product("자바 책", "도서", 30000);
        Product headphone = new Product("헤드폰", "전자제품", 120000);
        Product tablet = new Product("태블릿", "전자제품", 500000);
        Product charger = new Product("충전기", "액세서리", 25000);

        // 주문 목록 생성
        List<Order> orders = Arrays.asList(
                new Order(1, "김철수", Arrays.asList(laptop, headphone), LocalDate.of(2023, 3, 15)),
                new Order(2, "이영희", Arrays.asList(phone, charger), LocalDate.of(2023, 4, 20)),
                new Order(3, "박민수", Arrays.asList(book, tablet), LocalDate.of(2023, 5, 10)),
                new Order(4, "최지원", Arrays.asList(laptop, phone, charger), LocalDate.of(2023, 5, 22)),
                new Order(5, "김철수", Arrays.asList(tablet, book), LocalDate.of(2023, 6, 5))
        );

        // 1. 총액이 100만원 이상인 주문의 ID 목록을 반환하기
        List<Integer> moreThanTen = orders.stream()
                .filter(order -> order.getTotalAmount() >= 1000000)
                .map(order -> order.getOrderId())
                .toList();
        System.out.println("총액 100만원 이상 주문 ID: " + moreThanTen);

        // 2. 각 고객별 총 주문 금액을 계산하여 맵으로 반환하기
        Map<String, Double> totalAmount = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.getCustomerName(),
                        Collectors.summingDouble(order -> order.getTotalAmount())
                ));
        System.out.println("고객별 총 주문 금액: " + totalAmount);

        // 3. 모든 주문에서 가장 많이 구매된 제품 카테고리를 찾기
        String mostCategory = orders.stream()
                        .flatMap(order -> order.getProducts().stream())
                        .collect(Collectors.groupingBy(
                                product -> product.getCategory(),
                                Collectors.counting()
                        ))
                        .entrySet().stream()
                        .max((e1, e2) -> Long.compare(e1.getValue(), e2.getValue()))
                        .map(entry -> entry.getKey())
                        .orElse("없음");

        System.out.println("가장 많이 구매한 카테고리: " + mostCategory);

        // 4. 2023년 5월 이후의 주문에서 구매된 모든 제품의 이름을 중복 없이 반환하기

        // 5. 각 제품 카테고리별 평균 가격을 계산하기

        // 6. 모든 주문을 날짜별로 그룹화하고, 각 날짜의 총 주문 금액을 계산하기
    }
}