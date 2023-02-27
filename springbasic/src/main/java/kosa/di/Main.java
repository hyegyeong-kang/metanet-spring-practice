package kosa.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		
	//	BeanFactory factory = new GenericXmlApplicationContext(resource);
		/* 주문서에 따라 객체를 생성하고 객체간의 의존 관계 설정한 것 */
		
		
		ApplicationContext factory  = new AnnotationConfigApplicationContext(Factory.class);
		
		
		Service service = (Service)factory.getBean("writeService");
		service.insertService();
		
		
	}

}
