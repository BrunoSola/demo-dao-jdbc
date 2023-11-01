package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department INSERT ===");
        Department newDepartment = new Department(null, "Developer");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New ID = " + newDepartment.getId());

        System.out.println("\n=== TEST 2: department DELETE ===");
        System.out.println("Enter ID for delete test: ");
        int id = in.nextInt();
        departmentDao.deleteById(id);

        System.out.println("\n=== TEST 3: FindById department ===");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);
    }
}
