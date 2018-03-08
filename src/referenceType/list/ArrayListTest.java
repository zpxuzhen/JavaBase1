package referenceType.list;

import java.io.*;
import java.util.*;

/**
 * ���Է�������ͬ�Ķ���ArrayList��
 *
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

//��Ա������
class EmpManage
{
	private ArrayList al=null;
	public EmpManage()
	{
		al=new ArrayList();
	}
	//����Ա��
	public void addEmp(Emp emp)
	{
		al.add(emp);
	}
	//��ʾԱ���������Ϣ
	public void showInfo(String empNo)
	{
		//��������ArrayList()
		for (int i=0; i<al.size(); i++)
		{
			//ȥ��Emp����
			Emp emp=(Emp)al.get(i);
			//�Ƚϱ��
			if(emp.getEmpNo().equals(empNo))
			{
				System.out.println("�ҵ�Ա����������Ϣ�ǣ�");
				System.out.println("�����"+empNo);
				System.out.println("������"+emp.getName());
				System.out.println("������"+emp.getSal());
				
			}
		}
	}
	
	//�޸Ĺ���
	public void updateSal(String empNo,float newSal)
	{
		for(int i=0; i<al.size(); i++)
		{
			Emp emp=(Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo))
			{
				emp.setSal(newSal);
			}
		}
	}
	public void delEmp(String empNo)
	{
		for(int i=0; i<al.size(); i++)
		{
			Emp emp=(Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo))
			{
				al.remove(i);
			}
		}
	}
}

public class ArrayListTest {

	public static void main(String[] args) throws Exception{
		//����һ��EmpManage����
				EmpManage em=new EmpManage();
				//����һ���򵥵Ĳ˵�
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				while(true)
				{
					System.out.println("��ѡ��һ������:");
					System.out.println("1:��ʾ���һ����Ա");
					System.out.println("2����Ա����һ��:");
					System.out.println("3:�޸�һ����Ա");
					System.out.println("4��ɾ��һ����Ա");
					System.out.println("5���˳�");
					String operType=br.readLine();
					if(operType.equals("1"))
					{
						System.out.println("��������");
						String empNo=br.readLine();
						System.out.println("����������");
						String name=br.readLine();
						System.out.println("�����빤��");
						float sal=Float.parseFloat(br.readLine());
						Emp emp=new Emp(empNo,name,sal);
						em.addEmp(emp);
					}
					else if(operType.equals("2"))
					{
						System.out.println("��������");
						String empNo=br.readLine();
						em.showInfo(empNo);
					}
					else if(operType.equals("3"))
					{
						
					}
					else if(operType.equals("5"))
					{
						//�˳�
						System.exit(0);
					}
						
				}

	}

}
