package objectOriented;

/**
 * 泛型的必要性
 * 不用强制类型转换提高代码的安全性
 * 提到代码的重用率
 */
import java.lang.reflect.Method;
import java.util.*;

class Bird1
{
	public void test1()
	{
		System.out.println("aa");
	}
	public void count(int a, int b)
	{
		System.out.println(a+b);
	}
}
class Cat1
{
	private String color;
	private int age;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Dog1
{
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

//定义一个泛型类
class Gen<T>
{
	private T g;
	// 得到T的类型和名称
	public Gen(T g)
	{
		this.g=g;
	}
	public void showTypeName()
	{
		System.out.println("类型是："+this.g.getClass().getName());
		//通过反射机制可以得到T类型的很多信息（比如说得到成员函数名）
		Method []m=this.g.getClass().getDeclaredMethods();
		//  打印
		for(int i=0; i<m.length; i++)
		{
			System.out.println(m[i].getName());
		}
	}
	
}


public class GenericityTest {

	public static void main(String[] args) {
		/*体现泛型的安全性,不能强转*/
		ArrayList <Dog1>  al=new ArrayList<Dog1>();    
		Dog1 dog1=new Dog1();
		dog1.setAge(11);
		dog1.setName("大黄");
		al.add(dog1);
		Dog1 temp1=(Dog1)al.get(0);
		System.out.println("1名字:"+temp1.getName()+"年龄:"+temp1.getAge());
	//	Cat1 temp2=(Cat1)al.get(0); 如果强转会报错,
		Dog1 temp3=al.get(0);   //取al里中的第一个元素 不用强制类型转换
		System.out.println("3名字:"+temp3.getName()+"年龄:"+temp3.getAge());
		/*体现泛型的代码重用率*/
		Gen<Bird1> gen1=new Gen<Bird1>(new Bird1());
		/*java反射机制*/
		gen1.showTypeName();
		
	}

}
