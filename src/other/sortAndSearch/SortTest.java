package other.sortAndSearch;

import java.util.*;

/**
 * 功能演示各种排序法
 * 1：冒泡排序 Bubble
 * 2:插入排序 InsertSort
 * 3:选择排序 Select
 * 4:快速排序 QuickSort
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
			//Math.random()会随机产生一个 0到1的数字不会等于0 也不会等于1
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



//1:冒泡排序法
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
		//i是决定走几趟, 冒泡排序
		for(int i=0; i<arr.length-1; i++)
		{
			//内层循环，开始逐个比较，如果发现前一个数比后一个数大就交换
			for(int j=0;j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					//换位
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;		
				}
			}
		}
	}
}


//2:插入排序法
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
			//insertVal准备和前一个数比较
			int index=i-1;
			while(index>=0&&insertVal<arr[index])
			{
				//将把arr[index]向后移动
				arr[index+1]=arr[index];
				//让index 向前移动
				index--;
			}
			//将insertVal 插入到适当的位置
			arr[index+1]=insertVal;
		}
	}
}


//3:选择排序法
class Select extends Sort
{
	@Override
	public void sort() {
		sort(arr);
	}
	@Override
	public void sort(int arr[])
	{
		//认为第一个数字是最小的
		int temp=0;
		for(int j=0; j<arr.length-1; j++)
		{
			int min=arr[j];
			//记录最小数的下标
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


//4:快速排序法
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
		startTime=System.nanoTime();   //获取开始时间  
//		new Bubble().sort();
//		new InsertSort().sort();
//		new Select().sort();
		new QuickSort().sort();
		endTime=System.nanoTime(); //获取结束时间  
	    System.out.println("程序运行时间：" + (endTime - startTime) + "ns");    //输出程序运行时间
//		Sort.Show();
	}

}
