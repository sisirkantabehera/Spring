package com.pp.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pp.service.DBOperationService;

public class ClienTest {
public static void main(String[] args) throws Exception {
	ApplicationContext ctx = null;
	ctx = new FileSystemXmlApplicationContext("src/main/java/com/pp/cfgs/Persistance-Beans.xml");
	//ctx = new ClassPathXmlApplicationContext("src/main/java/com/pp/cfgs/Persistance-Beans.xml");
	//get Service bean
	DBOperationService service = (DBOperationService) ctx.getBean("DBOService");
	//call b method
	System.out.println("7499 emp details"+service.getEmpDetails(7499));
	System.out.println("All Emp Details:"+service.getAllEmpDetails());
	System.out.println("7499 emp salary(before hike)"+service.showSalary(7499));
	System.out.println("7499 emp salary hiking "+service.hikeSalary(7499));
	System.out.println("7499 emp salary after hike"+service.showSalary(7499));
	System.out.println("====================================");
	
}
}
