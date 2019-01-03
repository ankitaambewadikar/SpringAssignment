package com.capgemini.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.app.bean.Organization;

public class MainApp {

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		 Organization organization=(Organization)context.getBean("organization");
		/*
		 * System.out.println(organization.getBoardMembers());
		 * organization.getBranchManagers(); organization.getCities();
		 */
		 System.out.println(organization);

	}

}
