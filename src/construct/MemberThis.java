package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //멤버변수와 지역변수(매개변수)의 이름이 다른 경우에는 this를 생략해도 된다.
    }
}
