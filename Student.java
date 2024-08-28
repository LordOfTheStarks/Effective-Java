public class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public double getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Hans", 1, 85.0);
        students[1] = new Student("Bobby", 2, 90.5);
        students[2] = new Student("Sam", 3, 78.0);

        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        double averageMarks = totalMarks / students.length;
        System.out.println("Average Marks: " + averageMarks);

        for(int i = 0; i < students.length; i++) {
            System.out.println("Student: " + students[i].getName() + ", roll number: " + students[i].getRollNumber() + ", mark: " +
                    students[i].getMarks());
        }
    }

}
