package other.josephusProblem;

/**
 * ��ʽ�ⷨ:ʱ�临�Ӷ�O(log(n)/log(2))
 * ���������һ��Ļ�,ÿ��2�ξͳ�Ȧ.
 * �и�����㷨.
 *
 */
public class Demo_3 {
	static long startTime=0;
	static long endTime=0;
	public static void main(String[] args) {
		
	    doSomething();    //���ԵĴ����
	    
	    System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ns");    //�����������ʱ��
	}

	private static void doSomething() {
		//��n��,����m����,�������f
		int n=3333,m=2,f=0;
		startTime=System.nanoTime();   //��ȡ��ʼʱ��  
		//��������������λ�Ƕ���λ
		//�ٰ����λ���1,ȥ�����λ,ֻ��������λ
	    for (int i = 31; i > 0; i--) {
			if(((n>>i)&1) != 0){
				f=n^(1<<i);
				break;
			}
		}
	    f=2*f+1;
	    endTime=System.nanoTime(); //��ȡ����ʱ��  
	    System.out.println("����Ȧ:" + f);
	}
}
