package hiding;

class Student{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Main02 {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setAge(18);
		student.setName("����ȣ");
		
		System.out.println("���� : "+student.getAge());
		System.out.println("�̸� : "+student.getName());
	}
}