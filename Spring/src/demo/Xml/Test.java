package demo.Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.UserBiz;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		UserBiz userBiz = (UserBiz) context.getBean("userBiz");
		
		boolean flag = userBiz.login("admin", "12345");
		if (flag) {
			System.out.println("ok");
		} else {
			System.out.println("out");
		}
		((ConfigurableApplicationContext) context).close();
	}

}
