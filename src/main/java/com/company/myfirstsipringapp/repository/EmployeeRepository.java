package com.company.myfirstsipringapp.repository;

import com.company.myfirstsipringapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface  EmployeeRepository extends JpaRepository<Employee,Integer> {
    Long countById(Integer id);

}
