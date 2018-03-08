package other.josephusProblem;

/**
 * 数学解法:时间复杂度O(n）
 * 我们注意到原问题仅仅是要求出最后的胜利者的序号，
 * 而不是要读者模拟整个过程。
 * 因此如果要追求效率，就要打破常规，实施一点数学策略。
 * 
 */
/**
 * 问题描述:
 * n个人（编号0~(n-1）），
 * 从0开始报数，报到（m-1）的退出，
 * 剩下的人继续从0开始报数。求胜利者的编号。
 *
 */
/**
我们知道第一个人（编号一定是（m-1）) 出列之后，
剩下的n-1个人组成了一个新的约瑟夫环（以编号为k=m%n的人开始）:
k k+1 k+2 ... n-2,n-1,0,1,2,... k-2
并且从k开始报0,我们把他们的编号做一下转换：
k --> 0
k+1 --> 1
k+2 --> 2
...
...
k-2 --> n-2
变换后就完完全全成为了（n-1）个人报数的子问题，假如我们知道这个子问题的解:
例如x是最终的胜利者，那么根据上面这个表把这个x变回去不刚好就是n个人情况的解吗？
变回去的公式很简单，相信大家都可以推出来：x'=(x+k)%n
如何知道（n-1）个人报数的问题的解？对，只要知道（n-2）个人的解就行了。
（n-2）个人的解呢？当然是先求（n-3）的情况 ---- 
这显然就是一个倒推问题！好了，思路出来了，下面写递推公式：
令f表示i个人玩游戏报m退出最后胜利者的编号，最后的结果自然是f[n]
递推公式
f[1]=0;
f[i]=(f[i-1]+m)%i; (i>1）
有了这个公式，我们要做的就是从1 to n顺序算出f的数值，最后结果是f[n]。
因为实际生活中编号总是从1开始，我们输出f[n]+1 .
 */

public class Demo_2 {
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
	    for (int i = 1; i <= n; i++){
	    	f = (f + m) % i;
	    }
	    endTime=System.nanoTime(); //获取结束时间  
	    System.out.println("最后出圈:" + (f+1));
	}

}
