package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(4);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findByAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3: department Insert ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("INSERTED! New id: " + newDepartment.getId());

        System.out.println("\n=== TEST 5: seller Update ===");
        department = departmentDao.findById(5);
        department.setName("Foods");
        departmentDao.update(department);
        System.out.println("Update Completed");

        System.out.println("\n=== TEST 6: seller Delete ===");
        departmentDao.deleteById(7);
        System.out.println("Delete Completed");
    }
}
