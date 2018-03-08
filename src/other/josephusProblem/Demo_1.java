package other.josephusProblem;
/**
 * 模拟实现:时间复杂度O(nm）
 * 无论是用链表实现还是用数组实现都有一个共同点：
 * 要模拟整个游戏过程，不仅程序写起来比较烦，
 * 而且时间复杂度高达O(nm），
 * 当n，m非常大（例如上百万，上千万）的时候，
 * 几乎是没有办法在短时间内出结果的。
 *
 */

class Child
{
	int no;
	Child nextChild;   // 指向下一个Child的指针
	public Child(int no)
	{
		//给一个编号
		this.no=no;
	}
	
}
// 环形链表
class CyclLink
{
	//先定义一个指向链表第一个小孩的引用
	//指向第一个小孩的引用，不能动
	Child firstChild=null;
	Child temp=null;
	int len=0;//表示共有几个小孩
	int k=1;
	int m=0;
	//设置m
	public void setM(int m)
	{
		this.m=m;
	}
	//设置链表的大小
	public void setLen(int len)
	
	{
		this.len=len;
	}
	//设置从第几个人开始数数
	public void setK(int k)
	{
		this.k=k;
	}
	//开始play
	public void play()
	{
		Child temp=this.firstChild;
		System.out.print("出圈编号:");
		//1.先找到开始数数的人
		for(int i=1; i<k; i++)
		{
			temp=temp.nextChild;
		}
		while(this.len!=1)
		{
		//2.数(m-1)下,找到要出圈的前一个小孩
		for(int j=1; j<(m-1); j++)
		{
			temp=temp.nextChild;
		}
		//3.将数到m的小孩，退出
		Child temp2 = temp.nextChild;
//		System.out.print(temp2.no+" ");
		temp.nextChild=temp2.nextChild;
		//让temp指向下一个数数的小孩
		temp=temp.nextChild;
//		this.show();
		this.len--;
		}
		//最后一个小孩
		System.out.println("最后出圈"+temp.no);
	}

	//初始化环形链表
	public void createLink()
	{
		for(int i=1; i<=len; i++)
		{
			if(i==1)
			{
				//创建第一个小孩
				Child ch=new Child(i);
				this.firstChild=ch;
				this.temp=ch;
			}
			else
			{
				if(i==len)
				{
					//创建最后一个小孩
					Child ch=new Child(i);
					temp.nextChild=ch;
					temp=ch;
					temp.nextChild=this.firstChild;
				}
				else
				{
					//继续创建小孩
					Child ch=new Child(i);
					temp.nextChild=ch;
					temp=ch;				
				}		
		    }
	    }
}
	
//打印该环形链表
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
		
	    doSomething();    //测试的代码段
	    
	    System.out.println("程序运行时间：" + (endTime - startTime) + "ns");    //输出程序运行时间
	}
	private static void doSomething() {
		int n=3333,m=2,f=0;
		CyclLink cyclink=new CyclLink();
		cyclink.setLen(n);
		cyclink.createLink();
		cyclink.setK(1);
		cyclink.setM(m);
		cyclink.show();
		startTime=System.nanoTime();   //获取开始时间  
		cyclink.play();
		endTime=System.nanoTime(); //获取结束时间  
	}
	private static void doSomething2() {
		//数组方法耗时最多,其次链表
		int n=3333,m=2,f=0;
		boolean a[] =new boolean[n+1];
		for(int i =0;i<a.length;i++){
			a[i]=true;
		}
	    int  t=0,s=0;
	    startTime=System.nanoTime();   //获取开始时间  
	    do
	    {
	        ++t;//逐个枚举圈中的所有位置
	        if(t>n)
	            t=1;//数组模拟环状，最后一个与第一个相连
	        if(a[t])
	            s++;//第t个位置上有人则报数
	        if(s==m)//当前报的数是m
	        {
	            s=0;//计数器清零
//	            System.out.println("出圈:" + t);//输出被杀人编号
	            a[t]=false;//此处人已死，设置为空
	            f++;//死亡人数+1
	        }
	    }while(f!=n);//直到所有人都被杀死为止
	    System.out.println("出圈:" + t);//输出被杀人编号
	    endTime=System.nanoTime(); //获取结束时间  
	}
}
