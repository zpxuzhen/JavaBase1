package test.homework;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		A as = new A(a);
		System.out.println("转换前：");
		as.show();
		as.zhuanzhi();
		System.out.println("转换后：");
		as.show();
	}
}
class A{
	Integer[][] a = null;
	
	public A(Integer[][] a) {
		this.a = a;
	}
	
	public void zhuanzhi() {

		for(int i = 0; i < a.length;i++)
		{
			for(int j = 0; j < i;j++)
			{
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	}
	
	public void show() {
		for(int i = 0; i < a.length;i++)
		{
			for(int j = 0; j < a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
	} 
}
