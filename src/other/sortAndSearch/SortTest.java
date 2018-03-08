package other.sortAndSearch;

import java.util.*;

/**
 * ������ʾ��������
 * 1��ð������ Bubble
 * 2:�������� InsertSort
 * 3:ѡ������ Select
 * 4:�������� QuickSort
 */

abstract class Sort
{
	int len;
	static int [] arr = null;
	public  static int[] RandInt(int len){
		len=len;
		arr=new int[len];
		for (int i=0; i<len; i++)
		{
			//Math.random()���������һ�� 0��1�����ֲ������0 Ҳ�������1
			int t=(int)(Math.random()*10000);
			arr[i]=t;
		}
		return arr;
	}
	public  abstract void sort();
	public  abstract void sort(int arr[]);
	
	public  static void Show(){
		Show(arr);
	}
	
	public  static void Show(int arr[]){
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("%d ",arr[i]);
		} 
		System.out.println();
	}
}



//1:ð������
class Bubble extends Sort
{
	@Override
	public void sort() {
		sort(arr);
	}
	@Override
	public void sort(int arr[])
	{
		int temp=0;
		//i�Ǿ����߼���, ð������
		for(int i=0; i<arr.length-1; i++)
		{
			//�ڲ�ѭ������ʼ����Ƚϣ��������ǰһ�����Ⱥ�һ������ͽ���
			for(int j=0;j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					//��λ
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;		
				}
			}
		}
	}
}


//2:��������
class InsertSort extends Sort
{
	@Override
	public void sort() {
		sort(arr);
	}
	@Override
	public void sort(int arr[])
	{
		for(int i=1; i<arr.length; i++)
		{
			int insertVal=arr[i];
			//insertVal׼����ǰһ�����Ƚ�
			int index=i-1;
			while(index>=0&&insertVal<arr[index])
			{
				//����arr[index]����ƶ�
				arr[index+1]=arr[index];
				//��index ��ǰ�ƶ�
				index--;
			}
			//��insertVal ���뵽�ʵ���λ��
			arr[index+1]=insertVal;
		}
	}
}


//3:ѡ������
class Select extends Sort
{
	@Override
	public void sort() {
		sort(arr);
	}
	@Override
	public void sort(int arr[])
	{
		//��Ϊ��һ����������С��
		int temp=0;
		for(int j=0; j<arr.length-1; j++)
		{
			int min=arr[j];
			//��¼��С�����±�
			int minIndex=j;
			for(int k=j+1; k<arr.length; k++)
				if(min>arr[k])
				{
					min=arr[k];
					minIndex=k;
				}
			temp=arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
}


//4:��������
class QuickSort extends Sort
{
	@Override
	public void sort() {
		sort(arr);
	}
	@Override
	public void sort(int[] arr) {
		this.sort(arr,0 ,arr.length-1);
		
	}
	public void sort(int [] a, int low, int high )
	{
		int pos;
		if (low<high)
		{
			pos = FindPos(a, low, high);
			sort(a, low, pos-1);
			sort(a, pos+1, high);
		}
	}
	private int FindPos(int [] a, int low, int high)
	{
		int val = a[low];
		while (low<high)
		{
			while (low<high && a[high]>=val)
				--high;
			a[low] = a[high];
			while (low<high && a[low]<=val)
				++low;
			a[high] = a[low];
		}
		a[low] = val;
		return low;
	}
}



public class SortTest {
	static long startTime=0;
	static long endTime=0;
	public static void main(String[] args) {
		
		Sort.RandInt(10000);
		startTime=System.nanoTime();   //��ȡ��ʼʱ��  
//		new Bubble().sort();
//		new InsertSort().sort();
//		new Select().sort();
		new QuickSort().sort();
		endTime=System.nanoTime(); //��ȡ����ʱ��  
	    System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ns");    //�����������ʱ��
//		Sort.Show();
	}

}
