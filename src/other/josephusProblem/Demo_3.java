package other.josephusProblem;

/**
 * 公式解法:时间复杂度O(log(n)/log(2))
 * 如果再特殊一点的话,每数2次就出圈.
 * 有更快的算法.
 *
 */
public class Demo_3 {
	static long startTime=0;
	static long endTime=0;
	public static void main(String[] args) {
		
	    doSomething();    //测试的代码段
	    
	    System.out.println("程序运行时间：" + (endTime - startTime) + "ns");    //输出程序运行时间
	}

	private static void doSomething() {
		//共n人,数到m出列,最后编号是f
		int n=3333,m=2,f=0;
		startTime=System.nanoTime();   //获取开始时间  
		//先算出二进制最高位是多少位
		//再把最高位异或1,去掉最高位,只保留其它位
	    for (int i = 31; i > 0; i--) {
			if(((n>>i)&1) != 0){
				f=n^(1<<i);
				break;
			}
		}
	    f=2*f+1;
	    endTime=System.nanoTime(); //获取结束时间  
	    System.out.println("最后出圈:" + f);
	}
}
