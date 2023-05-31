import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee);
    Employee receiptEmployeeById(int id);
    List<Employee> gettingListAllEmployee();
    void changingEmployeeId(Employee employee, int id);
    void deleteEmployeeId(Employee employee);
}
