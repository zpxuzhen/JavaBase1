package objectOriented;

/**
 * 面向对象四大特征:抽象/封装/继承/多态
 * 访问修饰符:public protected 默认 private
 * 重载:方法名相同,参数类型/参数个数/参数顺序至少有一项不同,方法返回类型和修饰符可以不同.
 * 覆盖:子类重写父类的方法,子类方法不能缩小父类方法的访问权限.
 */
/**
 * 多态:
 * 父类  变量=new 子类 
 * 变量.方法    
 * 如果这个方法子类重写了父类的方法则调用子类的方法，
 * 如果没有重写则调用父类的方法 
 */
/**
 * 抽象类和接口都不能实例化对象,都可以实现多态.
 * 抽象类abstract : 可以没有抽象方法,抽象方法没有方法体.
 * 接口interface : 接口在抽象类的基础上,近一步规定变量是常量(不管加不加static和fianl).
 * final : 不能再被继承,不能再修改.
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
		System.out.println("鱼");
	}
}
class Bone extends Food
{
	public void showName()
	{
		System.out.println("骨头");
	}
}
//主人
class Master
{
	//给动物喂食物
	public void feed(Animal an, Food f)
	{
		an.eat();
		f.showName();
	}
}
//动物类Animal
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
		System.out.println("我不知道吃什么");
	}

}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("狗喜欢吃骨头");
	}
	
}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("猫喜欢吃鱼");
	}
}

public class FourFeatures {

	public static void main(String[] args) {
		Master master=new Master();
		master.feed(new Dog(), new Bone());  //多态
		master.feed(new Cat(), new Fish());
		
	}

}
