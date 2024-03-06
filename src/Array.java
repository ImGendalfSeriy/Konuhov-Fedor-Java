public class Array {
    void Masiv() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}