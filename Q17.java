public class pm {
    public static void main(String[] args) {
        for (int i = 51; i <= 100; i += 2) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
