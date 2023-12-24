public class Main {
    public static void main(String[] args) {

        int[] arr = new int[50];

        for (int i = 0, num = 2; i < 50; i++, num += 2) {
            arr[i] = num;
        }

        for (int i_a:arr)
        {
         System.out.println(i_a);
        }

    }
}