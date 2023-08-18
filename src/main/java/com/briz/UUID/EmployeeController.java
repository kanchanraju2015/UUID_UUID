package com.briz.UUID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("{city}")
public List<?> byid(@PathVariable String city)
{
	return erepo.findByCity(city);
}

}
