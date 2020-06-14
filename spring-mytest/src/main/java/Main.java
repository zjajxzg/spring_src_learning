import ioc.Book;
import ioc.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhigang.xu
 * @date 2020/5/12 23:20
 */
public class Main {
	public static void main(String[] args){
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());

		ApplicationContext xmlAc = new ClassPathXmlApplicationContext("src/main/resource/book.xml");
		Book book = xmlAc.getBean("book", Book.class);
		System.out.println(book);

		ApplicationContext studentContext = new ClassPathXmlApplicationContext("../resource/student.xml");
		Student student = studentContext.getBean("student", Student.class);
		System.out.println(student);
	}
}
