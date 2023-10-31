package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller FindById ===");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller FindByDepartment ===");
        List<Seller> list = sellerDao.findByDepartment(new Department(2,null));
        for (Seller obj : list  ) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller FindAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list  ) {
            System.out.println(obj);
        }
/*
        System.out.println("\n=== TEST 4: seller Insert ===");
        Seller newSeller = new Seller(null, "Bruno", "bruno@gmail.com", new Date(), 5000.00, new Department(2, null));
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New ID = " + newSeller.getId());
*/
        System.out.println("\n=== TEST 5: seller UPDATE ===");
        seller = sellerDao.findById(1);
        System.out.println(seller);
        seller.setName("Bruno Sola");
        sellerDao.update(seller);
        System.out.println("UPDATE completed!\n" + seller);
    }
}
