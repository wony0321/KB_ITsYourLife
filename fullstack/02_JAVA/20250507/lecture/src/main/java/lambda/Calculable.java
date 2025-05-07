package lambda;

@FunctionalInterface // 함수형 인터페이스 설정
// 추상메서드를 하나만 가져야한다!
// 표시(@, 엣): Annotation(어노테이션)
public interface Calculable {
    // 일반적으로 interface에 선언된 함수는 다 public abstract(추상, 불완전)
    void calculate(int x, int y);
}