package kr.co.sist.dao.exam;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.sub.UseMyBatis;
import kr.co.sist.domain.CpEmp4Domain;
import kr.co.sist.domain.MyTabDomain;
import kr.co.sist.vo.MyTabVO;

/**
 * @author user
 * MyBatis Handler를 사용하여 DB작업 수행 
 */
public class MyTabDAO {

	
	
	public int insertMyTab(MyTabVO mtVO) throws PersistenceException {
		int cnt=0;
		
		//MyBatis Handler 얻기
		UseMyBatis umb=UseMyBatis.getInstance();
		SqlSession ss=umb.getSqlSession();
		
		
		//Mapper애서 XML을 Parsing 하여 쿼리문을 실행한 결과를 얻는다.
		cnt=ss.insert("insertMyTab",mtVO);
		
		
		//쿼리문을 실행한 행 수가 1이라면
		if(cnt==1) {
			ss.commit();//transaction을 완료***************
		}
		
		//MyBatis Handler 닫기
		if(ss!=null) {ss.close();}
		
		
		return cnt;
	}
	
	
	
	
	
	public int updateMyTab(MyTabVO mtVO)  throws PersistenceException{
		int cnt=0;
		
		//MyBatis Handler 생성
		SqlSession ss=null;
		
		try {
			ss=UseMyBatis.getInstance().getSqlSession();
			cnt=ss.update("kr.co.sist.dao.examMapper.updateMyTab",mtVO);
			if(cnt==1) {
				ss.commit();
			}
		}finally {
			//MyBatis Handler 닫기
			if(ss!=null) {ss.close();}
		}//end finally
		
		return cnt;
	}
	
	
	
	
	
	
	public int deleteMyTab(String id)throws PersistenceException{
	
		int cnt=0;
		
		//MyBatis Handler 얻기
		SqlSession ss=null;
				
		try {
			//XML을 Parsing 하여 쿼리문을 실행한 결과를 얻는다.
			ss=UseMyBatis.getInstance().getSqlSession();
			cnt=ss.delete("kr.co.sist.dao.examMapper.deleteMyTab",id);
				if(cnt==1) {
						ss.commit();
					}
		}finally {
				
			//MyBatis Handler 닫기
			if(ss!=null) {ss.close();}
		}//end finally
				
		return cnt;
	}
	
	
	
	public MyTabDomain selectOneMyTab(MyTabVO mtVO) throws PersistenceException {
		MyTabDomain mtd=null;
		
		
		//MyBatis Handler를 얻기
		SqlSession ss=UseMyBatis.getInstance().getSqlSession();
		
		//쿼리문 찾고 수행
		mtd=ss.selectOne("kr.co.sist.dao.examMapper.selectMyTab",mtVO);
		
		
		//연결 끊기 
		if(ss!=null){ss.close();}
		
		
		return mtd;
		
	}

	
	public List<CpEmp4Domain> selectCpEmp4(String job) throws PersistenceException{
		 
		List<CpEmp4Domain> list=null;
		
		 //MyBatis Handler 얻기
		 SqlSession ss=UseMyBatis.getInstance().getSqlSession();
		 
		 //쿼리문 실행
		 list=ss.selectList("kr.co.sist.dao.examMapper.selectCpEmp4",job);
		 
		 //MyBatis Handler 닫기
		 if(ss!=null){ss.close();}//end if
		
		return list;
	}
	
	
	
}
