package aop.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @author zhigang.xu
 * @date 2020/6/12 15:48
 */
public class CglibTestMain {
	public static void main(String[] args) {
		MethodInterceptor methodInterceptor = new CglibProxy();
		Enhancer enhancer = new Enhancer();
//		enhancer.setSuperclass();
	}
}
