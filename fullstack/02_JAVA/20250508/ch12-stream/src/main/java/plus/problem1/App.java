package plus.problem1;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> list = List.of(
                new Product("아이폰X", "apple", "전자기기류", 1000000),
                new Product("맥프로", "apple", "전자기기류", 6300000),
                new Product("베지밀", "정식품", "음료류", 1000000),
                new Product("파스타면", "de cecco", "식품류", 10000),
                new Product("LG G7", "LG", "전자기기", 700000),
                new Product("기계식키보드", "LEOPOLD", "전자기기류", 100000),
                new Product("고양이", "베르나르베르베르", "도서", 15000),
                new Product("간다, 봐라", "법정스님", "도서", 8900),
                new Product("까페라떼", "디초코", "음료류", 4000),
                new Product("아포가토", "디초코", "디저트류", 4500)
        );

        //1.전자기기류만 모두 출력하세요.
        System.out.println("문제 1: 전자기기류만 모두 출력");
        list.stream()
                .filter(p -> p.getCategory().equals("전자기기류"))
                .forEach(product -> System.out.println(product));

        System.out.println();

        //2.apple사가 전제품 10% 할인한다고 할때, 해당제품명과 할인된 가격을 출력하세요.
        System.out.println("문제 2: apple사가 전제품 10% 할인");
        list.stream()
                .filter(p -> p.getBrand().equals("apple"))
                .forEach(p -> {
                    int discountedPrice = (int)(p.getPrice() * 0.9);
                    System.out.printf("%s - 할인된 가격: %d%n", p.getProductName(), discountedPrice);
                });

        System.out.println();

        //3. 디초코 상표명이 "dechocolatecoffee"로 변경되었다.
        //스트림상에서 디초코 상품들의 상표명을 "dechocolatecoffee"로 변경하고 출력하세요.
        System.out.println("문제 3: 디초코 상표명이 dechocolatecoffee로 변경하고");
        list.stream()
                .filter(p -> p.getBrand().equals("디초코"))
                .forEach(p -> p.setBrand("dechocolatecoffee"));

        list.stream()
                .forEach(p -> System.out.println(p));

        System.out.println();

        //4.금액이 십만원 이상인 상품을 따로 list로 생성하고 출력하세요.
        System.out.println("문제 4: 금액이 십만원 이상인 상품을 따로 list로 생성하고 출력");
        List<Product> tenOver = list.stream()
                .filter(p -> p.getPrice() >= 100000)
                .toList();
        tenOver.forEach(p -> System.out.println(p));
    }
}
