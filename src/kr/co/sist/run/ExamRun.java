package kr.co.sist.run;

import java.util.List;

import kr.co.sist.domain.CpEmp4Domain;
import kr.co.sist.domain.MyTabDomain;
import kr.co.sist.service.ExamService;
import kr.co.sist.vo.MyTabVO;

public class ExamRun {

	public static void main(String[] args) {

		ExamService es=new ExamService();
		
//		MyTabVO mtVO=new MyTabVO();
//		mtVO.setId("kim");
//		mtVO.setName("������");
//		mtVO.setAge(21);
//		mtVO.setEmail("kim1@test.com");
//		System.out.println(mtVO.toString());
		
		//System.out.println(es.addMyTab(mtVO));
		//System.out.println(es.modifyMyTab(mtVO));
		//System.out.println(es.removeMyTab("kim"));
		
//		--������ȸ
//		MyTabVO mtVO=new MyTabVO();
//		mtVO.setId("kim");
//		mtVO.setName("������");
//		
//		MyTabDomain mtd=es.searchOneMyTab(mtVO);
//		System.out.println("��ȸ��� : "+mtd);
		
//		---���� �� ��ȸ
		String job="������"; 
		List<CpEmp4Domain> list=es.searchCpEmp4(job);

		System.out.println(list); //null�� �ƴϰ� List�� 0 ���� EL���� empty�� ���ϸ� ��
		
	}

}