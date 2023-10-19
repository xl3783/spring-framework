import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ExampleBean bean = applicationContext.getBean(ExampleBean.class);
		System.out.println(bean);
	}
}
