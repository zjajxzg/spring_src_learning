import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhigang.xu
 * @date 2020/5/12 23:20
 */
public class Main {
	public static void main(String[] args){
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());
	}
}
