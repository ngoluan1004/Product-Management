package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.ProductRepository;
import com.vti.entity.Product;

/**
 * @author Admin
 *
 */
public class ProductService {
	ProductRepository repository;

	public ProductService() throws FileNotFoundException, IOException {
		repository = new ProductRepository();
	}
	public List<Product> getListProduct() throws ClassNotFoundException, SQLException{
		return repository.getListProduct();
	}
	public void deleteProductById(int id) throws ClassNotFoundException, SQLException {
		repository.deleteProductById(id);
	}
	public void updateProduct(int id,String name) throws ClassNotFoundException, SQLException {
		repository.updateProduct(id, name);
	}
	public void addProduct(String name,String price,String infor, String detail) throws ClassNotFoundException, SQLException {
		repository.addProduct(name, price, infor, detail);
	}
}
