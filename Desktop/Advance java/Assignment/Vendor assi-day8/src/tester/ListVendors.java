package tester;

import static utils.HibernateUtils.getSf;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.*;

import dao.VendorDaoImpl;

public class ListVendors {

	public static void main(String[] args) {
		// Testing bootstrapping of hibernate configuration (creating singleton n
		// immutable instance of SessionFactory (SF)
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			VendorDaoImpl dao = new VendorDaoImpl();
			System.out.println("Enter date(yr-mon-day) n amount ");
			dao.listSpecificVendors(LocalDate.parse(sc.next()), sc.nextDouble()).
			forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
