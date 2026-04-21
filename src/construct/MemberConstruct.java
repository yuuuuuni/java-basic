package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 추가(생성자도 오버로딩을 할 수 있다.)
    MemberConstruct(String name, int age) {
        this(name, age, 50); //변경
    }

    //생성자
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
