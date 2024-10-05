package SimpleExercises;

public class ArrayCopy {
    public static void main(String[] args) {
        int original[] = {1,2,3,4,5,6};
        int shallowCopy[] = original;
        int deepCopy[] = original.clone();

        original[0] = 100;

        System.out.println("Original array: ");
        for (int num : original) System.out.print(num + " ");

        System.out.println("\nShallow copy: ");
        for (int num : shallowCopy) System.out.print(num + " ");

        System.out.println("\nDeep copy: ");
        for (int num : deepCopy) System.out.print(num + " ");
    }
}
