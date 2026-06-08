package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //컴파일 오류, 참조형 변수 data가 final 이고 이미 한번 할당을 했기 때문에 새로 담을 수 없음

        //참조 대상의 값은 변경 가능. Data 인스턴스의 value 값은 final이 아니기 때문
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}
