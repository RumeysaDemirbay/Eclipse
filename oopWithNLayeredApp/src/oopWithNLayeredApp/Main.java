package oopWithNLayeredApp;

import java.text.FieldPosition;
import java.util.logging.Logger;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception{
		Product product1=new Product(1,"Iphone Xr",9000);
		
		Logger[] loggers= {};
		
		ProductManager productManager= 
			new ProductManager (new HibernateProductDao(),loggers);
		productManager.add(product1);

	}

}
