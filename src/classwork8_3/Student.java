package classwork8_3;

public class Student {
    String name;
    int age;
    int averageGrade;
    Student(String name, int age, int averageGrade){
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }
    boolean isExcellent(){
        return averageGrade >= 90;
    }
    void print(){
        System.out.println("name" + name);
        System.out.println("age" + age); 
        System.out.println("Average Grade" + averageGrade);
        System.out.println("polojeniye" + isExcellent());
    }
}
