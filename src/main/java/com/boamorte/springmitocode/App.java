package com.boamorte.springmitocode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.boamorte.beans.AppConfig;
import com.boamorte.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/boamorte/xml/beans.xml");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Mundo m = appContext.getBean(Mundo.class); // Tambien podria ser = (Mundo) appContext.getBean("mundo");
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext) appContext).close();
	}

}
