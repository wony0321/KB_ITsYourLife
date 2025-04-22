package ch07.sec04.exam01;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa= new SupersonicAirplane();
        sa.takeOff();
        sa.fly();

        sa.flyMode = SupersonicAirplane.SUPERSONIC; // 2
        sa.fly();

        sa.flyMode = SupersonicAirplane.NORMAL; // 1
        sa.fly();
        sa.land();
    }
}
