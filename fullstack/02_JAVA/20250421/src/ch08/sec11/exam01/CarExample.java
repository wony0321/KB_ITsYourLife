package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new HankookTire();
        myCar.run();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
        myCar.run();
    }
}
