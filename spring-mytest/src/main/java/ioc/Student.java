package ioc;

/**
 * 有参构造方法注入
 *
 * @author zhigang.xu
 */
public class Student {
	private String name;

	private String age;

	public Student(String name, String age) {
		this.name = name;
		this.age = age;
	}
}
