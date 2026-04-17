package homework_14_1;

public class Student {
    private String name;
    private int grade;
    private static int totalStudents = 0;
    
    public Student(String name, int grade) {
        this.name = name; 
        this.grade = grade; 
        totalStudents++;
    }
    
    public String getStatus() {
        if (grade>=90){
            return "great";
        }
        else if(grade>=70){
            return "good";
        }
        else if(grade>=50) {
            return "not bad";
        }
        else {
            return "bad";
        }
    }
    
    public static int getTotalStudents() { return totalStudents; }
    
    @Override
    public String toString() {
       return "Student{name='" + name + "', grade=" + grade + ", status='" + getStatus() + "'}";
    }
}