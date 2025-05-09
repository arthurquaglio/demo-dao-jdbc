package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department d = new Department(1, "Books");
        Seller s = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, d);


        SellerDao sllerdao = DaoFactory.createSellerDao();

        System.out.println(s);

    }
}
