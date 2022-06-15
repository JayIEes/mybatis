package kr.co.sist.domain;

/**
 * MyBatis에서 조회 결과를 저장하기 위해 만드는 VO => Domain
 * @author user
 */
public class MyTabDomain {
	
	private String name,email,input_date;
	private int age;
	
	
	public MyTabDomain() {
		System.out.println("MyTableDomain을 MyBatis Framework에서 생성");
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

