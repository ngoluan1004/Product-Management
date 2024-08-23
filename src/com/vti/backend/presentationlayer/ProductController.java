package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.ProductService;
import com.vti.entity.Product;

/**
 * @author Admin
 *
 */
public class ProductController {
	ProductService Service;

	public ProductController() throws FileNotFoundException, IOException {
		Service = new ProductService();
	}
	public List<Product> getListProduct() throws ClassNotFoundException, SQLException{
		return Service.getListProduct();
	} 
	
	public void deleteProductById(int id) throws ClassNotFoundException, SQLException {
		Service.deleteProductById(id);
		
	}
	public void updateProduct(int id,String name) throws ClassNotFoundException, SQLException {
		Service.updateProduct(id, name);
	}
	public void addProduct(String name,String price,String infor, String detail) throws ClassNotFoundException, SQLException {
		Service.addProduct(name, price, infor, detail);
	}
}
