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
//		mtVO.setName("김진구");
//		mtVO.setAge(21);
//		mtVO.setEmail("kim1@test.com");
//		System.out.println(mtVO.toString());
		
		//System.out.println(es.addMyTab(mtVO));
		//System.out.println(es.modifyMyTab(mtVO));
		//System.out.println(es.removeMyTab("kim"));
		
//		--한행조회
//		MyTabVO mtVO=new MyTabVO();
//		mtVO.setId("kim");
//		mtVO.setName("김진영");
//		
//		MyTabDomain mtd=es.searchOneMyTab(mtVO);
//		System.out.println("조회결과 : "+mtd);
		
//		---여러 행 조회
		String job="개발자"; 
		List<CpEmp4Domain> list=es.searchCpEmp4(job);

		System.out.println(list); //null이 아니고 List가 0 으로 EL에서 empty로 비교하면 됨
		
	}

}
