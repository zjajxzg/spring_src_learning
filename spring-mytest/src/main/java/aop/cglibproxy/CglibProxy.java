package aop.cglibproxy;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhigang.xu
 * @date 2020/6/12 15:22
 */
public class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("before-------------");
		Object o1 = methodProxy.invokeSuper(objects, objects);
		System.out.println("after-------------");
		return o1;
	}
}
