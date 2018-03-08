package objectOriented;

class FatherClassName {
	int age;
	String name;
	static int number = 1;

	public FatherClassName(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getNumber() {
		return number;
	}
	public static void setNumber(int number) {
		FatherClassName.number = number;
	}
	
}

class ClassName extends FatherClassName {
	
	public ClassName(int age, String name) {
		super(age, name);

	}
	
	static {
		System.out.println("Only Once");
	}
	
	public void show() {
		System.out.println("I am "+this.name+",I am "+this.age+"years old.");
		System.out.println("Number :"+this.number);
		System.out.println("Number :"+number);
		System.out.println("Number :"+FatherClassName.number);
		number = 2;
		System.out.println("Number :"+FatherClassName.number + ",now!");
		FatherClassName.setNumber(3);
		System.out.println("Number :"+FatherClassName.getNumber() + ",now!");
	}
	
}

public class ClassAndObject {

	public static void main(String[] args) {
		ClassName cn=new ClassName(1, "ะกร๗");
		cn.show();
		cn.show();

	}

}
