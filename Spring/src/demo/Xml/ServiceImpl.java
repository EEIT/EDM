package demo.Xml;

public class ServiceImpl implements Iservice{        //��{Iservice��������k
	
	private Idao dao;//�w�q�@��Idao����
	
	public void service(String name){
		System.out.println(dao.sayHello(name));//��{service����k
	}

	
	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}

	
}
