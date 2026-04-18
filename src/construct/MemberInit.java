package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name; //this를 생략하면 두 name이 자신의 가장 가까운 스코프를 먼저 선택하기 때문에 둘 다 지역변수(매개변수) name을 선택하게 된다.
        this.age = age;
        this.grade = grade;
    }
}
