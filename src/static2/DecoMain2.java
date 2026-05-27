package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); //static 메서드는 클래스로 직접 접근

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }

}
