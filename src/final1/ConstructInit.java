package final1;

//final 필드 - 생성자 초기화
public class ConstructInit {
    final int value;

    //final을 필드에 사용할 경우 생성자를 통해서 한번만 할당 가능. 이후에는 value 값을 변경할 수 없음
    public ConstructInit(int value) {
        this.value = value;
    }
}
