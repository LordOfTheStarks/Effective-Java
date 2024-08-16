import java.util.Scanner;

public class SimpleMathSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int n;

        while (choice != 0) {
            System.out.println(" ");
            System.out.println("1. Simple Sequence");
            System.out.println("2. Math Sequence");
            System.out.println("3. Triangular numbers");
            System.out.println("4. Visualization of Triangular numbers");
            System.out.println("0. Exit");

            System.out.print("Provide a number: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Determine the length of the sequence: ");
                    n = sc.nextInt();
                    if (n >= 1) {
                        printS1(n);
                    } else {
                        ErrorMsg();
                    }
                    break;
                case 2:
                    System.out.println("Determine the length of the sequence: ");
                    n=sc.nextInt();
                    if (n >= 1) {
                        printS2(n);
                    } else {
                        ErrorMsg();
                    }
                    break;
                case 3:
                    System.out.println("Determine the length of the sequence: ");
                    n=sc.nextInt();
                    if (n >= 1) {
                        printS3(n);
                    } else {
                        ErrorMsg();
                    }
                    break;
                case 4:
                    System.out.println("Determine the length of the sequence: ");
                    n=sc.nextInt();
                    if (n >= 1) {
                        printTri(n);
                    } else {
                        ErrorMsg();
                    }
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid number!");
            }
        }
    }

    public static void printS1(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(i * i + " ");
        }
    }

    public static void printS2(int number) {
        for (int j = 1; j <= number; j++) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
            } else {
                System.out.print(j * -1 + " ");
            }
        }
    }

    public static void printS3(int number) {
        for (int k = 1; k <= number; k++) {
            int tria = k * (k + 1) / 2;
            System.out.print(tria);
            System.out.print(" ");
        }
    }

    public static void printTri(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void ErrorMsg() {
        System.out.println("Error.");
    }
}