/**
 * 
 */
package org.rpublish.sts1.controllers;
import org.rpublish.sts1.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 *
 */
@RestController
public class RpubCtrl1 {
	
	@RequestMapping(value="/emplyee/getAll",method=RequestMethod.GET,produces="application/json")
	public Employee getEmployee() {
		Employee emp=new Employee("Neelam",123,"SoftwareEngeneering","Technology Analyst");
		return emp;		
	}

}
