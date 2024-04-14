

public class Test {

    public static void main(String[] args) {
        String ana = "Ana";
        if ("Ana".equals(ana)) {
            System.out.println("Ana are mere si stie SSH");
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean checkSum (int number) {
        int a = 5;
        int b = 2;
        int sum = sum(a, b);
        if (sum % 2 == 0) {
            System.out.println("sum is even");
            return true;
        } else {
            System.out.println("sum is odd");
            return false;
        }
    }
}
