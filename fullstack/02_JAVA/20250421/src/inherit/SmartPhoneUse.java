package inherit;

public class SmartPhoneUse {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("black", "galaxy");
        // myPhone: 주소, 참조형변수, 필드들 3개가 저장된 힙영역의 주소
        System.out.println(myPhone.color);
        myPhone.model = "갤럭시25";
        // new 클래스명()을 하면 필드를 객체마다 따로따로 각각 저장해야함
        // 필드들이 다 무더기로 생성됨 (필드 3개가 다 복사되어 생성)
        // 원본영역(메서드영역, static 영역)
        // 스택영역(호출되는 메서드 변수들 만들어쓰라고 주는 영역
        // 힙영역(필드들 생성, 배열 리스트 생성)

//        SmartPhone yourPhone = new SmartPhone("gray", "iPhone");
        System.out.println(myPhone.model);
        System.out.println(myPhone.wifi);
        myPhone.bell(); // Phone
        myPhone.setWifi(true); // SmartPhone
        myPhone.internet(); // SmartPhone


    }
}
