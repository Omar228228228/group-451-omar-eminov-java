package classwork15;

public class Task {
    //5 v odnom
    public class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void introduce() {
            System.out.println("Menya zovut " + name + ", mne " + age + " let");
        }

        public void study() { }
    } 
}
