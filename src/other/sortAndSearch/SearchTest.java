package other.sortAndSearch;

/**
 * ���ܣ����ֲ���
 * 
 */

//1�����ַ�����
class BinaryFind
{
	public void find(int leftIndex, int rightIndex, int val, int arr[])
	{
		//�����ҵ��м����
		int midIndex=(rightIndex+leftIndex)/2;
		int midVal=arr[midIndex];
		if(rightIndex>leftIndex)
		{
			if(midVal==val)
			{
				System.out.println("�ҵ��±�"+midIndex);
			}else {
				if(rightIndex==leftIndex+1){
					System.out.println("û���ҵ�");
				}else {
					if(midVal>val)
					{
						//�����е������
						find(leftIndex,  midIndex, val, arr);	
					}
					else if(midVal<val)
					{
						//��arr���ұ�����
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
