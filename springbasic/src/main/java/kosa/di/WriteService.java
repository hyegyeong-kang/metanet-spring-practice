package kosa.di;


import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.beans.factory.annotation.Qualifier;*/

@org.springframework.stereotype.Service
public class WriteService implements Service {
	
	@Autowired
	/* @Qualifier("mySQLDao") */ 	/* Ŭ���� �̸��ε� �ձ��ڸ� �ҹ��ڷ� �ٲ� */
	private Dao dao;
	
	WriteService() {}
	
	
	
	public WriteService(Dao dao) {
		super();
		this.dao = dao;
	}

	public void insertService() {
		System.out.println("WriteService insertService() ȣ��");
		dao.insertBoard();
	}


	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
