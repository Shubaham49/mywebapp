package tester;

import static utils.HibernateUtils.getSf;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.*;

import dao.VendorDaoImpl;
import pojos.Role;
import pojos.Vendor;

public class RegisterNewVendor {

	public static void main(String[] args) {
		// Testing bootstrapping of hibernate configuration (creating singleton n
		// immutable instance of SessionFactory (SF)
		try(SessionFactory sf=getSf();Scanner sc=new Scanner(System.in))
		{
			//create vendor instance
			VendorDaoImpl dao=new VendorDaoImpl();
			System.out.println("Enter user details : name,email,password,reg amount,reg date (yr-mon-day),role");
			//create transient Vendor : exisiting heap
			Vendor transientVendor=new Vendor(sc.next(), sc.next(), sc.next(), 
					sc.nextDouble(), LocalDate.parse(sc.next()), Role.valueOf(sc.next().toUpperCase()));
			System.out.println(dao.registerVendor(transientVendor));
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
