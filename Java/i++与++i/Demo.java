public class Demo {
    public static void main(String[] args) {
        int a = 1;
        int b = a++; //此处 b = a 后 a = a + 1
        System.out.println("a=" + a); // 2
        System.out.println("b=" + b); // 1
        int c = 5;
        int d = ++c; //此处 c = c + 1 后 d = c
        System.out.println("c=" + c); // 6
        System.out.println("d=" + d); // 6
    }
}