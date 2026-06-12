package extends1.ex2;

public class ElectricCar extends Car { //부모인 Car의 기능을 물려받음(자식은 부모를 알고있음)

    public void charge() {
        System.out.println("충전합니다.");
    }
}
