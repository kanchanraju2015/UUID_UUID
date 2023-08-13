package com.briz.UUID;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoty extends JpaRepository<Employee,UUID> 
{

}
