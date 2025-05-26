package Armstrong;

public class tillGivenNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 0 to 999 are:");

        for (int num = 0; num <= 999; num++) {
            int original = num;
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }
    }
}
