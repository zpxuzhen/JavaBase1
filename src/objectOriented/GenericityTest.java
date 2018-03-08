package objectOriented;

/**
 * ���͵ı�Ҫ��
 * ����ǿ������ת����ߴ���İ�ȫ��
 * �ᵽ�����������
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

//����һ��������
class Gen<T>
{
	private T g;
	// �õ�T�����ͺ�����
	public Gen(T g)
	{
		this.g=g;
	}
	public void showTypeName()
	{
		System.out.println("�����ǣ�"+this.g.getClass().getName());
		//ͨ��������ƿ��Եõ�T���͵ĺܶ���Ϣ������˵�õ���Ա��������
		Method []m=this.g.getClass().getDeclaredMethods();
		//  ��ӡ
		for(int i=0; i<m.length; i++)
		{
			System.out.println(m[i].getName());
		}
	}
	
}


public class GenericityTest {

	public static void main(String[] args) {
		/*���ַ��͵İ�ȫ��,����ǿת*/
		ArrayList <Dog1>  al=new ArrayList<Dog1>();    
		Dog1 dog1=new Dog1();
		dog1.setAge(11);
		dog1.setName("���");
		al.add(dog1);
		Dog1 temp1=(Dog1)al.get(0);
		System.out.println("1����:"+temp1.getName()+"����:"+temp1.getAge());
	//	Cat1 temp2=(Cat1)al.get(0); ���ǿת�ᱨ��,
		Dog1 temp3=al.get(0);   //ȡal���еĵ�һ��Ԫ�� ����ǿ������ת��
		System.out.println("3����:"+temp3.getName()+"����:"+temp3.getAge());
		/*���ַ��͵Ĵ���������*/
		Gen<Bird1> gen1=new Gen<Bird1>(new Bird1());
		/*java�������*/
		gen1.showTypeName();
		
	}

}
