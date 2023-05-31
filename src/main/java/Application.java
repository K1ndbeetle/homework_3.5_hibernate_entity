public class Application {
    public static void main(String[] args) {

        try {
            EmployeeDAO employeeDAO = new EmployeeDAOImpl();
            //employeeDAO.addEmployee("Melnikov", "Aleksey", "M", 20, 3);
            System.out.println(employeeDAO.receiptEmployeeById(6).toString());
            //employeeDAO.changingEmployeeId(6, "last_name = 'Kviten'", "first_name = 'Viktor'");
            System.out.println(employeeDAO.gettingListAllEmployee());
            //employeeDAO.deleteEmployeeId(7);
        } catch (Exception ex) {
                System.out.println("Ошибка при подключении к БД!");
                ex.printStackTrace();
        }

    }
}