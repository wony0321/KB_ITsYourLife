package ch07.sec04.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        double radius = 10.0;

        Calculator calc = new Calculator();
        System.out.println("원 면적 (Cal): " + calc.areaCircle(radius));

        Computer comp = new Computer();
        System.out.println("원 면적 (Com): " + comp.areaCircle(radius));
    }
}
