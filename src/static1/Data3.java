package static1;

public class Data3 {
    public String name;
    public static int count; //static (static 변수는 메서드 영역 안의 static 영역에서 생성되고 관리됨. 인스턴스 안에 없음)

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
