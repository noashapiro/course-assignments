public class ThrowsTest {
    public static void main(String[] args) {
//        dangerousMethod();
    }

    private static void dangerousMethod() throws Exception{
        veryDangerousMethod();
    }

    private static void veryDangerousMethod() throws Exception{
        System.out.println(1/0);
    }
}
