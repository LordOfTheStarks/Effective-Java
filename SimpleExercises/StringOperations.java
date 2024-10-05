package SimpleExercises;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.equalsIgnoreCase(str2)){
            System.out.println("The strings are equal (ignoring case)");
        } else {
            System.out.println("The strings are not equal");
        }
        scanner.close();
    }
}
