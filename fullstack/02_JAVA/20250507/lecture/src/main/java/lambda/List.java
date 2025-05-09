package lambda;

// 객체 지향 코드 설계의 2대 원칙
// - 결합도는 낮게 설계함: 특정한 클래스를 설정하지 않고 여러 개의 클래스가 조립되도록 설정
// - 응집도는 높게 설계함: 하나의 클래스에는 하나의 역할만 넣음.
// 입력용 클랫, db처리용 클래스, 전달용 클래스를 각가의 용도에 맞게 각각 클래스로 분리시켜 만들어놓아야 다양하게 조립 가능
// 하나의 클래스가 어떤 역할을 하는지에 대하 정도
// - 입력용 클래스: 입력 역할 100% --> O
// - 입력용 클래스: 입력 역할 30%, db처리역할 70% --> X

public class List {
    public static void main(String[] args) {

    }
}
