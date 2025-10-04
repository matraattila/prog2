public class Main {
    public static void main(String[] args) {
        Prog2Info info = Student.class.getAnnotation(Prog2Info.class);

        System.out.println(info.oktato());
        System.out.println(info.terem());
    }
}