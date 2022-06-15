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
 * MyBatis Handler�� ����Ͽ� DB�۾� ���� 
 */
public class MyTabDAO {

	
	
	public int insertMyTab(MyTabVO mtVO) throws PersistenceException {
		int cnt=0;
		
		//MyBatis Handler ���
		UseMyBatis umb=UseMyBatis.getInstance();
		SqlSession ss=umb.getSqlSession();
		
		
		//Mapper�ּ� XML�� Parsing �Ͽ� �������� ������ ����� ��´�.
		cnt=ss.insert("insertMyTab",mtVO);
		
		
		//�������� ������ �� ���� 1�̶��
		if(cnt==1) {
			ss.commit();//transaction�� �Ϸ�***************
		}
		
		//MyBatis Handler �ݱ�
		if(ss!=null) {ss.close();}
		
		
		return cnt;
	}
	
	
	
	
	
	public int updateMyTab(MyTabVO mtVO)  throws PersistenceException{
		int cnt=0;
		
		//MyBatis Handler ����
		SqlSession ss=null;
		
		try {
			ss=UseMyBatis.getInstance().getSqlSession();
			cnt=ss.update("kr.co.sist.dao.examMapper.updateMyTab",mtVO);
			if(cnt==1) {
				ss.commit();
			}
		}finally {
			//MyBatis Handler �ݱ�
			if(ss!=null) {ss.close();}
		}//end finally
		
		return cnt;
	}
	
	
	
	
	
	
	public int deleteMyTab(String id)throws PersistenceException{
	
		int cnt=0;
		
		//MyBatis Handler ���
		SqlSession ss=null;
				
		try {
			//XML�� Parsing �Ͽ� �������� ������ ����� ��´�.
			ss=UseMyBatis.getInstance().getSqlSession();
			cnt=ss.delete("kr.co.sist.dao.examMapper.deleteMyTab",id);
				if(cnt==1) {
						ss.commit();
					}
		}finally {
				
			//MyBatis Handler �ݱ�
			if(ss!=null) {ss.close();}
		}//end finally
				
		return cnt;
	}
	
	
	
	public MyTabDomain selectOneMyTab(MyTabVO mtVO) throws PersistenceException {
		MyTabDomain mtd=null;
		
		
		//MyBatis Handler�� ���
		SqlSession ss=UseMyBatis.getInstance().getSqlSession();
		
		//������ ã�� ����
		mtd=ss.selectOne("kr.co.sist.dao.examMapper.selectMyTab",mtVO);
		
		
		//���� ���� 
		if(ss!=null){ss.close();}
		
		
		return mtd;
		
	}

	
	public List<CpEmp4Domain> selectCpEmp4(String job) throws PersistenceException{
		 
		List<CpEmp4Domain> list=null;
		
		 //MyBatis Handler ���
		 SqlSession ss=UseMyBatis.getInstance().getSqlSession();
		 
		 //������ ����
		 list=ss.selectList("kr.co.sist.dao.examMapper.selectCpEmp4",job);
		 
		 //MyBatis Handler �ݱ�
		 if(ss!=null){ss.close();}//end if
		
		return list;
	}
	
	
	
}