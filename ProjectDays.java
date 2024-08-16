import java.util.Scanner;

public class ProjectDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("1. Project Planner");
            System.out.println("2. Get how many days in a Month");
            System.out.println("3. Get day of the week");
            System.out.println("0. Exit");
            System.out.println(" ");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    planProject(sc);
                    break;
                case 2:
                    System.out.print("Enter month(1-12): ");
                    int month = sc.nextInt();
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    getDaysOfMonth(month, year);
                    break;
                case 3:
                    System.out.print("Day: ");
                    int day = sc.nextInt();
                    System.out.print("Month: ");
                    int months = sc.nextInt();
                    System.out.print("Year: ");
                    int years = sc.nextInt();
                    getDayOfTheWeek(day, months, years);
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
    public static void planProject(Scanner sc) {
        System.out.print("Enter scope of the project: ");
        int scope = Integer.parseInt(sc.next());
        System.out.print("Enter the hourly wages: ");
        int hourlyRate = Integer.parseInt(sc.next());
        System.out.print("Enter how many employees there are: ");
        int availableEmployees = Integer.parseInt(sc.next());
        int totalCost = scope * hourlyRate * availableEmployees;
        int totalDays = scope / (availableEmployees * 8);
        System.out.println("Total Cost to complete the project: " + totalCost);
        System.out.println("Total Days to complete the project: " + totalDays);
    }
    public static int getDaysOfMonth(int month, int year) {
        int days = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        else if (month == 2) {
            if (leapYears(year)) {
                days = 29;
            } else {
                days = 28;
            }
        }
        else {
            System.out.println("The number of month entered is not within range of 1-12!!");
        }
        System.out.println("Days of the month: " + days);
        return days;
    }
    //This is to calculate in which years the month 'February' is 29 days
    public static boolean leapYears(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    //Used Zeller's Congruence algorithm to implement this.
    //I used Gregorian calendar calculation.
    public static void getDayOfTheWeek(int day, int month, int year) {
        int invalidDate = getDaysOfMonth(month, year);
        if (day < 1 || day > invalidDate) {
            System.out.println("Invalid date: " + day + "." + month + "." + year + " [The day does not exist!]");
            return;
        }
        if (month == 1) {
            month = 13;
            year--;
        }
        if (month == 2) {
            month = 14;
            year--;
        }
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = (day + (13 * (m+1) / 5) + k + (k/4) + (j/4) + 5*j);
        h = h % 7;
        switch (h) {
            case 0: System.out.println("Saturday");
            break;
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
        }
    }
}
