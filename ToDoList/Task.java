package ToDoList;

public class Task {
    String taskName;
    boolean isCompleted;

    public Task(String taskName){
        this.taskName = taskName;
        this.isCompleted = false;
    }
    public void markAsCompleted(){
        this.isCompleted = true;
    }
    @Override
    public String toString(){
        return taskName + (isCompleted ? " (Completed)" : "");
    }
}
