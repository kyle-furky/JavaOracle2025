public class Test4 {
    public static void main(String[] args) {
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught");
        } finally {
            System.out.println("Finally");
        }
    }
}
