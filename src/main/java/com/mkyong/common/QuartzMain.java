package com.mkyong.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzMain {
	public static void main(String[] args) throws Exception {
		new ClassPathXmlApplicationContext("Spring-Quartz.xml");

	}
}