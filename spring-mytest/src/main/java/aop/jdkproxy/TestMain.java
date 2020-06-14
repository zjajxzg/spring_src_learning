package aop.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @author zhigang.xu
 * @date 2020/6/12 11:53
 */
public class TestMain {

	public static void main(String[] args) {
		JdkProxyImpl jdkProxy = new JdkProxyImpl();
		InvocationHandlerTest handler = new InvocationHandlerTest(jdkProxy);
		// Proxy.newProxyInstance 第一个参数是classLoader   第二个参数是接口 注意要用子类的class对象去获取到其实现的接口
		JdkProxy o = (JdkProxy) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), jdkProxy.getClass().getInterfaces(), handler);
		o.test();
	}
}
