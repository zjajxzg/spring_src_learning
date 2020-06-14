package aop.jdkproxy;

/**
 * @author zhigang.xu
 * @date 2020/6/12 11:14
 */
public class JdkProxyImpl implements JdkProxy {
	@Override
	public void test() {
		System.out.println("test");
	}
}
