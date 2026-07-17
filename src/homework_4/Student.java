package homework_4;

public class Student {
	String name;
	int id;

	static int totalStudents = 0;
	static int nextId = 1;

	public Student(String name) {
		this.name = name;
		this.id = nextId;
		nextId++;
		totalStudents++;
	}

	public static int getTotalStudents() {
		return totalStudents;
	}

	public void printInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
	}

}