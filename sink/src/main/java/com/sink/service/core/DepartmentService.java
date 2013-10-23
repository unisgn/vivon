package com.sink.service.core;

public interface DepartmentService {

    public Department findDepartmentById(int id);
    public Department findDepartmentByNumber(String number);
    public Department findDepartmentByCode(String code);
    public Department findDepartmentByName(String name);
    
    public List<Department> findAllDepartments();
    public int addDepartment(Department dep);
    public void updateDepartment(Department dep);
    public void toggleActiveOfDepartment(int id);
    
}
