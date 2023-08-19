package com.briz.UUID;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoty extends JpaRepository<Employee,UUID> 
{
List<Employee> findByCity(String city);
List<Employee> findByName(String name);
List<Employee> findByNameOrCity(String name,String city);
  List<Employee> findByNameAndCity(String name,String city);
}
