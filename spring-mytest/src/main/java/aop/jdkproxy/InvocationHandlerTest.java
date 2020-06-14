package aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhigang.xu
 * @date 2020/6/12 11:16
 */
public class InvocationHandlerTest implements InvocationHandler {

	private JdkProxyImpl jdkProxy;

	public InvocationHandlerTest(JdkProxyImpl jdkProxy) {
		this.jdkProxy = jdkProxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before------");
		Object invoke = method.invoke(jdkProxy, args);
		System.out.println("after-------");
		return invoke;
	}

}
