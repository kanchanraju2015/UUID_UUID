package com.briz.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeRepositoty erepo;
@RequestMapping("/test")
public String test()
{
	return "this is uuid test only";
}
@RequestMapping("/save")
public String test1()
{
Employee e=new Employee();
e.setAge(12);
e.setCity("tata");
e.setName("manisha kumar");
erepo.save(e);
return"data saved into database";
}

}
