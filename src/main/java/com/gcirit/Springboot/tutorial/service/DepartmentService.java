package com.gcirit.Springboot.tutorial.service;

import com.gcirit.Springboot.tutorial.entity.Department;
import com.gcirit.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department deleteDepartmentByName(String departmentName);

    Department fetchDepartmentByName(String departmentName);
}
