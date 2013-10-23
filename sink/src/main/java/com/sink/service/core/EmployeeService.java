
public interface EmployeeService {
    public Employee findEmployeeByName(String name);
    public Employee findEmployeeById(int id);
    public Employee findEmployeeByCode(String code);
    public Employee findEmployeeByNumber(String number);
    
    public List<Employee> findAllEmployee();
    public List<Employee> findEmployeeByDepartment(Department department);
    
    
    public List<Employee> searchEmployees(String keyword);
    public void toggleActiveOfEmployee(int id);
    
    public int addEmployee(Employee employee);
    public void updateEmployee(Employee employee);
}
