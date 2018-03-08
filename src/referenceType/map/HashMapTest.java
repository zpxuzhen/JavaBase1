package referenceType.map;

import java.util.*;

/**
 * HashMap:键不能重复,会被覆盖掉.
 * containsKey方法：如果Map中包含此键则返回 true,否在false
 * HashMap取出后没有顺序,LinkedHashMap有顺序.
 */
/**
* HashMap和Hashtable的区别
* Hashtable是同步，保证线程的安全，键值不允许为空
* HashMap单线程比较安全效率高，允许为空值
*/

//雇员类
class Emp
{
	//学号
	private String empNo;
	private String name;
	private float sal;
	//构造函数
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
		//创建一个HashMap 对象
				HashMap hm=new HashMap();
				
				Emp emp1=new Emp("s001","aaa", 3.5f);
				Emp emp2=new Emp("s002","老桑", 3.5f);
				Emp emp3=new Emp("s003","老王", 3.5f);
				
				//将emp放到hm中
				hm.put("s001", emp1);
				hm.put("s002", emp2);
				hm.put("s003", emp3);   
		   		if(hm.containsKey("s002"))
				{
					System.out.println("有该员工");
					//如何得到键值
					Emp emp=(Emp)hm.get("s002");
					System.out.println("名字："+emp.getName());
				}
				else
				{
					System.out.println("没有该员工");
				}  
				//遍历HashMap中所有的key和value   取出的值没有顺序
				Iterator it=hm.keySet().iterator();
				// hasNext返回一个boolean
				while(it.hasNext())
				{
					String key=it.next().toString();
					//通过key去除vale
					Emp emp=(Emp)hm.get(key);
					System.out.println("名字"+emp.getName());
					System.out.println("薪水："+emp.getSal());
				}   

	}

}
