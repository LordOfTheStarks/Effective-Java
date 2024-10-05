package StackOperations;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        BasicStack stack = new BasicStack(input.length());

        for(char ch : input.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append((char)stack.pop());
            System.out.print("Reversed string: " + reversed + " ");
            scanner.close();
        }
    }
}
