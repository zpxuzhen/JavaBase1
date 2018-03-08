package other.josephusProblem;
/**
 * ģ��ʵ��:ʱ�临�Ӷ�O(nm��
 * ������������ʵ�ֻ���������ʵ�ֶ���һ����ͬ�㣺
 * Ҫģ��������Ϸ���̣���������д�����ȽϷ���
 * ����ʱ�临�Ӷȸߴ�O(nm����
 * ��n��m�ǳ��������ϰ�����ǧ�򣩵�ʱ��
 * ������û�а취�ڶ�ʱ���ڳ�����ġ�
 *
 */

class Child
{
	int no;
	Child nextChild;   // ָ����һ��Child��ָ��
	public Child(int no)
	{
		//��һ�����
		this.no=no;
	}
	
}
// ��������
class CyclLink
{
	//�ȶ���һ��ָ�������һ��С��������
	//ָ���һ��С�������ã����ܶ�
	Child firstChild=null;
	Child temp=null;
	int len=0;//��ʾ���м���С��
	int k=1;
	int m=0;
	//����m
	public void setM(int m)
	{
		this.m=m;
	}
	//��������Ĵ�С
	public void setLen(int len)
	
	{
		this.len=len;
	}
	//���ôӵڼ����˿�ʼ����
	public void setK(int k)
	{
		this.k=k;
	}
	//��ʼplay
	public void play()
	{
		Child temp=this.firstChild;
		System.out.print("��Ȧ���:");
		//1.���ҵ���ʼ��������
		for(int i=1; i<k; i++)
		{
			temp=temp.nextChild;
		}
		while(this.len!=1)
		{
		//2.��(m-1)��,�ҵ�Ҫ��Ȧ��ǰһ��С��
		for(int j=1; j<(m-1); j++)
		{
			temp=temp.nextChild;
		}
		//3.������m��С�����˳�
		Child temp2 = temp.nextChild;
//		System.out.print(temp2.no+" ");
		temp.nextChild=temp2.nextChild;
		//��tempָ����һ��������С��
		temp=temp.nextChild;
//		this.show();
		this.len--;
		}
		//���һ��С��
		System.out.println("����Ȧ"+temp.no);
	}

	//��ʼ����������
	public void createLink()
	{
		for(int i=1; i<=len; i++)
		{
			if(i==1)
			{
				//������һ��С��
				Child ch=new Child(i);
				this.firstChild=ch;
				this.temp=ch;
			}
			else
			{
				if(i==len)
				{
					//�������һ��С��
					Child ch=new Child(i);
					temp.nextChild=ch;
					temp=ch;
					temp.nextChild=this.firstChild;
				}
				else
				{
					//��������С��
					Child ch=new Child(i);
					temp.nextChild=ch;
					temp=ch;				
				}		
		    }
	    }
}
	
//��ӡ�û�������
	public void show()
	{
		Child temp=this.firstChild;
		do
		{
			System.out.print(temp.no+" ");
			temp=temp.nextChild;
		}while(temp!=this.firstChild);
		System.out.println();
	}
}

public class Demo_1 {
	static long startTime=0;
	static long endTime=0;
	public static void main(String[] args) {
		
	    doSomething();    //���ԵĴ����
	    
	    System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ns");    //�����������ʱ��
	}
	private static void doSomething() {
		int n=3333,m=2,f=0;
		CyclLink cyclink=new CyclLink();
		cyclink.setLen(n);
		cyclink.createLink();
		cyclink.setK(1);
		cyclink.setM(m);
		cyclink.show();
		startTime=System.nanoTime();   //��ȡ��ʼʱ��  
		cyclink.play();
		endTime=System.nanoTime(); //��ȡ����ʱ��  
	}
	private static void doSomething2() {
		//���鷽����ʱ���,�������
		int n=3333,m=2,f=0;
		boolean a[] =new boolean[n+1];
		for(int i =0;i<a.length;i++){
			a[i]=true;
		}
	    int  t=0,s=0;
	    startTime=System.nanoTime();   //��ȡ��ʼʱ��  
	    do
	    {
	        ++t;//���ö��Ȧ�е�����λ��
	        if(t>n)
	            t=1;//����ģ�⻷״�����һ�����һ������
	        if(a[t])
	            s++;//��t��λ������������
	        if(s==m)//��ǰ��������m
	        {
	            s=0;//����������
//	            System.out.println("��Ȧ:" + t);//�����ɱ�˱��
	            a[t]=false;//�˴�������������Ϊ��
	            f++;//��������+1
	        }
	    }while(f!=n);//ֱ�������˶���ɱ��Ϊֹ
	    System.out.println("��Ȧ:" + t);//�����ɱ�˱��
	    endTime=System.nanoTime(); //��ȡ����ʱ��  
	}
}
