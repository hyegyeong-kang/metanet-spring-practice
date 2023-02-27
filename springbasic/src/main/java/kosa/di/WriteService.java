package kosa.di;


import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.beans.factory.annotation.Qualifier;*/

@org.springframework.stereotype.Service
public class WriteService implements Service {
	
	@Autowired
	/* @Qualifier("mySQLDao") */ 	/* 클래스 이름인데 앞글자만 소문자로 바뀜 */
	private Dao dao;
	
	WriteService() {}
	
	
	
	public WriteService(Dao dao) {
		super();
		this.dao = dao;
	}

	public void insertService() {
		System.out.println("WriteService insertService() 호출");
		dao.insertBoard();
	}


	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
