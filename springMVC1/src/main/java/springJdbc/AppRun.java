package springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("abcd1.xml");
			EmpDAO e=(EmpDAO) context.getBean("dao");
			e.create11();

	}

}
