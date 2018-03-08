package test.homework;

import java.util.Scanner;

public class Test1 {

	private static Scanner in;

	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		in = new Scanner(System.in);
		int a = in.nextInt();
		for(int i = 1;i <= a;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println("");
		}
	}
}
