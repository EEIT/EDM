package demo.Xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			
		Iservice hello=(Iservice)context.getBean("service");
		hello.service("Helloween");
		((ConfigurableApplicationContext)context).close();

	}

}
