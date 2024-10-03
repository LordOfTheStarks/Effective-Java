package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Mark Task As Completed");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = sc.nextLine();
                    tasks.add(new Task(taskName));
                    break;
                case 2:
                    System.out.print("Enter task index to remove: ");
                    int indexToRemove = sc.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < tasks.size()) {
                        tasks.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.println("To-Do List: ");
                    for(int i = 0; i < tasks.size(); i++){
                        System.out.println(i + ": " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Enter task index to mark as complete: ");
                    int indexToComplete = sc.nextInt();
                    if(indexToComplete >= 0 && indexToComplete < tasks.size()) {
                        tasks.get(indexToComplete).markAsCompleted();
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
