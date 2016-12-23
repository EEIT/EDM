package demo.Xml;

public class ServiceImpl implements Iservice{        //實現Iservice介面的方法
	
	private Idao dao;//定義一個Idao物件
	
	public void service(String name){
		System.out.println(dao.sayHello(name));//實現service的方法
	}

	
	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}

	
}
