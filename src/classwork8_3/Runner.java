package classwork8_3;

public class Runner {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Shahbaz", 333, 100),
            new Student("Gabyuyan", 45, 34),
            new Student("petr", 89, 90)
        };
        for(Student s : students){
            if(s.isExellent()){
                s.print();
            }
        }
    }
}
