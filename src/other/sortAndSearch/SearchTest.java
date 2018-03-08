package other.sortAndSearch;

/**
 * 功能：二分查找
 * 
 */

//1：二分法查找
class BinaryFind
{
	public void find(int leftIndex, int rightIndex, int val, int arr[])
	{
		//首先找到中间的数
		int midIndex=(rightIndex+leftIndex)/2;
		int midVal=arr[midIndex];
		if(rightIndex>leftIndex)
		{
			if(midVal==val)
			{
				System.out.println("找到下标"+midIndex);
			}else {
				if(rightIndex==leftIndex+1){
					System.out.println("没有找到");
				}else {
					if(midVal>val)
					{
						//在数中的左边找
						find(leftIndex,  midIndex, val, arr);	
					}
					else if(midVal<val)
					{
						//在arr的右边找数
						find(midIndex, rightIndex, val,arr);
					}
				}
			}
		}
	}
}


public class SearchTest {

	public static void main(String[] args) {
		int arr[]={2,5,7,12,25};
		BinaryFind bf=new BinaryFind();
		bf.find(0,arr.length,25,arr);

	}

}
