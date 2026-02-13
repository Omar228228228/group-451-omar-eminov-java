package classwork_7_5;

public class Runner {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Adolf", 18, 85);
        students[1] = new Student("Omar", 19, 90);
        students[2] = new Student("Jeffry", 18, 78);
        students[3] = new Student("P", 20, 95);
        students[4] = new Student("otr731", 17, 88);
        Student best = students[0];
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].grade;
            if (students[i].grade > best.grade) {
                best = students[i];
            }
        }
        System.out.println("Best student" + students[1]);
        System.out.println("Average grade " + (sum / students.length));
    }
}
