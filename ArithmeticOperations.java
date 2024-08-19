import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while(choice != 0){
            System.out.println("\n\n1. Byte overflow demo");
            System.out.println("2. Demonstrate arithmetic operations");
            System.out.println("3. Convert decimal to binary");
            System.out.println("4. Convert Hexadecimal to decimal");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    startByteOverflowDemo();
                    break;
                case 2:
                    demonstrateArithmeticOperations(sc);
                    break;
                case 3:
                    convertToBinary(sc);
                    break;
                case 4:
                    convertHexToDec0(sc);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }
        sc.close();
        }
    public static void startByteOverflowDemo() {
        byte num = 0;
        int i = 0;
        while (i < 10) {
            System.out.print(num + " ");
            num+=30;
            i++;
        }
        System.out.println();
    }
    public static void demonstrateArithmeticOperations(Scanner sc) {
        System.out.println("Please provide a number for the first operand");
        int a = sc.nextInt();
        System.out.println("Please provide a number for the second operand");
        int b = sc.nextInt();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println(a + "+" + b + "=" + sum);
        System.out.println(a + "-" + b + "=" + difference);
        System.out.println(a + "*" + b + "=" + product);
        System.out.println(a + "/" + b + "=" + quotient);
        System.out.println(a + "%" + b + "=" + remainder);
    }
    public static void convertToBinary(Scanner sc) {
        System.out.println("Please provide a number");
        int decimal = sc.nextInt();

        int binaryDigit;

        System.out.println("Binary representation (from bottom to top): ");

        while (decimal > 0) {
            binaryDigit = decimal % 2;
            System.out.println(binaryDigit);
            decimal /= 2;
        }
    }
    public static int convertToNumber(char ch) {

        ch = Character.toUpperCase(ch);

        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A'; }
        else {
            return -1;
        }
    }

    public static void convertHexToDec0(Scanner sc) {
        System.out.print("Please provide a hexadecimal number (e.g. 1f): ");
        String hex = sc.next();

        int result = 0;
        for (char ch : hex.toCharArray()) {
            int code = convertToNumber(ch);
            result = 16 * result + code;
            System.out.println(ch + " -> " + code);
        }
        System.out.println("Corresponding decimal number: " + result);
    }
}
