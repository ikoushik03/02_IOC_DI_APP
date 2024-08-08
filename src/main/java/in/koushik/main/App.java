package in.koushik.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.koushik.it.Car;

public class App {

	public static void main(String[] args) {
			
		
			//Start IOC Container
		
		//	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		
		
			ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
			Car bean = context.getBean(Car.class);
//			bean.drive();
//			System.out.println(bean);
//			System.out.println(bean);
			
			
	}

}
