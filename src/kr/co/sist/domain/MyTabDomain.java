package kr.co.sist.domain;

/**
 * MyBatis���� ��ȸ ����� �����ϱ� ���� ����� VO => Domain
 * @author user
 */
public class MyTabDomain {
	
	private String name,email,input_date;
	private int age;
	
	
	public MyTabDomain() {
		System.out.println("MyTableDomain�� MyBatis Framework���� ����");
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInput_date() {
		return input_date;
	}
	public void setInput_date(String input_date) {
		this.input_date = input_date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "MyTabDomain [name=" + name + ", email=" + email + ", input_date=" + input_date + ", age=" + age + "]";
	}



}
