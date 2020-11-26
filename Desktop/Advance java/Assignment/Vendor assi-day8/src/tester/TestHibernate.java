package tester;
import static utils.HibernateUtils.getSf;
import org.hibernate.*;

public class TestHibernate {

	public static void main(String[] args) {
		// Testing bootstrapping of hibernate configuration (creating singleton n
		// immutable instance of SessionFactory (SF)
		try(SessionFactory sf=getSf())
		{
			System.out.println("Hibernate up n running....");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
