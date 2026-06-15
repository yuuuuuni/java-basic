package extends1.overriding;

public class ElectricCar extends Car {

    @Override //부모의 기능을 재정의 했다는 표식. 오버라이드가 정확히 안되면 컴파일 오류 발생.
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
