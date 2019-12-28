package com.pp.dao;

import java.util.List;
import java.util.Map;

public interface DBOperation {
	
	public int insert(int no,String name,String job,long sal);
	public int getSalary(int no);
	public Map<String,Object> listEmpDetails(int no);
	public List<Map<String,Object>> listAllEmpDetails();
	public int UpdateEmpSalary(int no,int newSal);
	

}
