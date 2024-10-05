package SimpleExercises;

public class ArrayInit {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of the array is: " + sum);
    }
}
