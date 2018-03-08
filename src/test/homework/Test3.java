package test.homework;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Mario m = new Mario(4, 7, 1, 1);
		do{
			m.show();
		}while(m.control());
	}

}

class Mario{
	private int chang;
	private int kuan;
	private int Mx;
	private int My;
	
	private static Scanner ain = new Scanner(System.in);
	
	public Mario(int chang,int kuan,int Mx,int My){
		this.chang = chang;
		this.kuan = kuan;
		this.Mx = Mx;
		this.My = My;
	}
	
	public void show() {
		
		for(int i = 0; i < this.chang;i++)
		{
			for(int j = 0; j < this.kuan;j++)
			{
				if(this.Mx == i && this.My == j)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	
	public boolean control() {
		
		String a = ain.next();
		if(a.equals("w") || a.equals("W"))  
		{
			this.Mx--;
		}
		else if(a.equals("s") || a.equals("S"))  
		{
			this.Mx++;
		}
		else if(a.equals("a") || a.equals("A"))  
		{
			this.My--;
		}
		else if(a.equals("d") || a.equals("D"))  
		{
			this.My++;
		}
		if(this.Mx < 0) 			this.Mx = 0;
		if(this.My < 0) 			this.My = 0;
		if(this.Mx >= this.chang) 	this.Mx = this.chang - 1;
		if(this.My >= this.kuan) 	this.My = this.kuan - 1;
		
		return true;
	}
}
