package referenceType.map;

import java.util.*;

/**
 * HashMap:�������ظ�,�ᱻ���ǵ�.
 * containsKey���������Map�а����˼��򷵻� true,����false
 * HashMapȡ����û��˳��,LinkedHashMap��˳��.
 */
/**
* HashMap��Hashtable������
* Hashtable��ͬ������֤�̵߳İ�ȫ����ֵ������Ϊ��
* HashMap���̱߳Ƚϰ�ȫЧ�ʸߣ�����Ϊ��ֵ
*/

//��Ա��
class Emp
{
	//ѧ��
	private String empNo;
	private String name;
	private float sal;
	//���캯��
	public Emp(String empNo, String name,float sal)
	{
		this.empNo=empNo;
		this.name=name;
		this.sal=sal;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
}

public class HashMapTest {

	public static void main(String[] args) {
		//����һ��HashMap ����
				HashMap hm=new HashMap();
				
				Emp emp1=new Emp("s001","aaa", 3.5f);
				Emp emp2=new Emp("s002","��ɣ", 3.5f);
				Emp emp3=new Emp("s003","����", 3.5f);
				
				//��emp�ŵ�hm��
				hm.put("s001", emp1);
				hm.put("s002", emp2);
				hm.put("s003", emp3);   
		   		if(hm.containsKey("s002"))
				{
					System.out.println("�и�Ա��");
					//��εõ���ֵ
					Emp emp=(Emp)hm.get("s002");
					System.out.println("���֣�"+emp.getName());
				}
				else
				{
					System.out.println("û�и�Ա��");
				}  
				//����HashMap�����е�key��value   ȡ����ֵû��˳��
				Iterator it=hm.keySet().iterator();
				// hasNext����һ��boolean
				while(it.hasNext())
				{
					String key=it.next().toString();
					//ͨ��keyȥ��vale
					Emp emp=(Emp)hm.get(key);
					System.out.println("����"+emp.getName());
					System.out.println("нˮ��"+emp.getSal());
				}   

	}

}
