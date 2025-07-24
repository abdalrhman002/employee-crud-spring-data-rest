package com.mujahid.employee_crud_api.dao;

import com.mujahid.employee_crud_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
