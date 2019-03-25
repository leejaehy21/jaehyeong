package org.jaehyeong.jdbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springmain {
	public static void main(String[] args) {
		// 클래스 패스에서 chap02.xml 파일을 읽어서 컨텍스트 초기화
		// ctx 에는 chap02.xml에서 정의한 모든 빈들이 들어있다.
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap02.xml");
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		g1.greet();

		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		g2.greet();

System.out.println(g1 == g2);
}
}