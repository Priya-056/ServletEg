package com.sonata.rest.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.rest.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value="/employee",method=RequestMethod.GET, produces ={"application/xml"})
	public List<Employee> getEmpDetails(){
		
		List<Employee> list= new ArrayList<>();
		
		Employee emp1=new Employee();
		emp1.setEmpid("SONATA2255441");
		emp1.setEmpname("Priya S");
		emp1.setEmpsal(100000);
		
		Employee emp2=new Employee();
		emp2.setEmpid("SONATA2255446");
		emp2.setEmpname("Yamini V");
		emp2.setEmpsal(90000);
		
		list.add(emp1);
		list.add(emp2);
		
		return list;
		
		
	}
}
