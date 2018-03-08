package objectOriented;

/**
 * ��������Ĵ�����:����/��װ/�̳�/��̬
 * �������η�:public protected Ĭ�� private
 * ����:��������ͬ,��������/��������/����˳��������һ�ͬ,�����������ͺ����η����Բ�ͬ.
 * ����:������д����ķ���,���෽��������С���෽���ķ���Ȩ��.
 */
/**
 * ��̬:
 * ����  ����=new ���� 
 * ����.����    
 * ����������������д�˸���ķ������������ķ�����
 * ���û����д����ø���ķ��� 
 */
/**
 * ������ͽӿڶ�����ʵ��������,������ʵ�ֶ�̬.
 * ������abstract : ����û�г��󷽷�,���󷽷�û�з�����.
 * �ӿ�interface : �ӿ��ڳ�����Ļ�����,��һ���涨�����ǳ���(���ܼӲ���static��fianl).
 * final : �����ٱ��̳�,�������޸�.
 */

class Food
{
	String name;
	public void showName()
	{
		
	}
}
class Fish extends Food
{
	public void showName()
	{
		System.out.println("��");
	}
}
class Bone extends Food
{
	public void showName()
	{
		System.out.println("��ͷ");
	}
}
//����
class Master
{
	//������ιʳ��
	public void feed(Animal an, Food f)
	{
		an.eat();
		f.showName();
	}
}
//������Animal
class Animal
{
	String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void eat()
	{
		System.out.println("�Ҳ�֪����ʲô");
	}

}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("��ϲ���Թ�ͷ");
	}
	
}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("èϲ������");
	}
}

public class FourFeatures {

	public static void main(String[] args) {
		Master master=new Master();
		master.feed(new Dog(), new Bone());  //��̬
		master.feed(new Cat(), new Fish());
		
	}

}
