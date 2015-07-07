package com.mkyong.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is the entry class, using the XML approach
 * @author user
 *
 */
public class QuartzMain {
	public static void main(String[] args) throws Exception {
		new ClassPathXmlApplicationContext("Spring-Quartz.xml");

	}
}