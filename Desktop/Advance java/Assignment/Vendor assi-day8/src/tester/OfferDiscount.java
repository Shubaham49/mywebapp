package tester;

import static utils.HibernateUtils.getSf;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.*;

import dao.VendorDaoImpl;

public class OfferDiscount {

	public static void main(String[] args) {
		// Testing bootstrapping of hibernate configuration (creating singleton n
		// immutable instance of SessionFactory (SF)
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			VendorDaoImpl dao = new VendorDaoImpl();
			System.out.println("Enter discount n date(yr-mon-day)  ");
			dao.applyDiscount(sc.nextDouble(),LocalDate.parse(sc.next())).
			forEach(v->System.out.println(v.getName()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
