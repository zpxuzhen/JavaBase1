package referenceType;

/**
 * ������鲻�ܶ�̬�ı��С������,����������򼯺���
 * list/map/set/queue
 */

//����һ������
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
		/*����*/
		Dog dogs[]=new Dog[3];
		dogs[0]=new Dog();   
		dogs[0].setName("����");
		dogs[0].setWeight(4.5f);
		dogs[1]=new Dog();   
		dogs[1].setName("����");
		dogs[1].setWeight(3.6f);
		dogs[2]=new Dog();   
		dogs[2].setName("֨֨");
		dogs[2].setWeight(4.7f);
		for(int j=0; j<dogs.length; j++)
		{
			System.out.println("��������"+dogs[j].name+"  ��������"+dogs[j].weight);
		}
		/*��ά����  :���εĶ�ά���鲻��Ļ�Ĭ��Ϊ0s*/
		int a[][]=new int[4][6];
		a[1][1]=1;
		a[2][1]=2;
		a[2][3]=3;
		//��ͼ�����
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			//����
			System.out.println();	
		}
	}

}
