package com.pp.service;

import java.util.List;
import java.util.Map;

import com.pp.dao.DBOperationDAO;

public class DBOperationService {
	private DBOperationDAO dao;
	public void setDao(DBOperationDAO dao) {
		this.dao =dao;
	}
	
	public String registerEmp(int no,String name, String job,int sal) {
		int result = dao.insert(no, name, job, sal);
		if(result == 0)
			return no +"EMP is Not Resgister";
		else 
			return no +"EMP is Register";
	}
	public int showSalary(int no) {
		int salary = dao.getSalary(no);
		return salary;
	}
	
	public String hikeSalary(int no) {
		int salary = showSalary(no);
		int newsal = 0;
	if(salary>= 50000)
		newsal = Math.round(salary+(salary*0.1f));
	else 
		newsal = Math.round(salary+(salary*02f));
	int result = dao.UpdateEmpSalary(no, newsal);
	if(result == 0)
		return no+"Emp salary is not hiked";
	else
		return no+"Emp salary is hiked";
	
	}
	public Map<String,Object> getEmpDetails(int no)throws Exception{
		Map<String,Object> map = dao.listEmpDetails(no);
		if(map!=null)
			return map;
		else 
		   throw new Exception(no+"emp not found");
	}
	
	public List<Map<String,Object>> getAllEmpDetails() throws Exception{
		List<Map<String,Object>> list = dao.listAllEmpDetails();
		if(list!=null)
			return list;
		else 
			throw new Exception("Employee not found");
	}

}
