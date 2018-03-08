package referenceType;

/**
 * 解决数组不能动态改变大小的问题,出现了链表或集合类
 * list/map/set/queue
 */

//定义一个狗类
class Dog
{
	public String name;
	public float weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}

public class Array {

	public static void main(String[] args) {
		/*数组*/
		Dog dogs[]=new Dog[3];
		dogs[0]=new Dog();   
		dogs[0].setName("花花");
		dogs[0].setWeight(4.5f);
		dogs[1]=new Dog();   
		dogs[1].setName("兰兰");
		dogs[1].setWeight(3.6f);
		dogs[2]=new Dog();   
		dogs[2].setName("吱吱");
		dogs[2].setWeight(4.7f);
		for(int j=0; j<dogs.length; j++)
		{
			System.out.println("狗的名字"+dogs[j].name+"  狗的体重"+dogs[j].weight);
		}
		/*多维数组  :整形的多维数组不填的话默认为0s*/
		int a[][]=new int[4][6];
		a[1][1]=1;
		a[2][1]=2;
		a[2][3]=3;
		//把图形输出
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			//换行
			System.out.println();	
		}
	}

}
