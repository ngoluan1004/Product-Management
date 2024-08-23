package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.vti.entity.Category;
import com.vti.entity.Manufacturer;
import com.vti.entity.Product;
import com.vti.utils.JdbcUtils;

/**
 * @author 
 *
 */
public class ProductRepository {
	private JdbcUtils jdbc;
	
	public ProductRepository() throws FileNotFoundException, IOException {
		jdbc = new JdbcUtils();
	}
	
	public Manufacturer getManuById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM Manufacturer WHERE ManufacturerId = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet result = preStatement.executeQuery();
		if (result.next()) {
			Manufacturer manu = new Manufacturer(result.getInt(1), result.getString(2));
			return manu;
		} else {
			jdbc.disConnection();
			return null;
		}
	}
	
	public Category getCateById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM Category WHERE CategoryId = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet result = preStatement.executeQuery();
		if (result.next()) {
			Category cate = new Category(result.getInt(1), result.getString(2));
			return cate;
		} else {
			jdbc.disConnection();
			return null;
		}
	}
	
	public List<Product> getListProduct() throws ClassNotFoundException, SQLException{
		List<Product> products = new ArrayList<>();
		String sql = "SELECT * FROM Product";
		ResultSet result = jdbc.executeQuery(sql);
		while(result.next()) {
			Product product = new Product();
			product.setId(result.getInt(1));
			product.setName(result.getString(2));
			product.setPrice(result.getString(3));
			product.setInfor(result.getString(4));
			product.setDetail(result.getString(5));
			product.setRatingStar(result.getInt(6));
			product.setProductImageName(result.getString(7));
			Manufacturer manu = getManuById(result.getInt(8));
			product.setManufacturer(manu);
			Category cate = getCateById(result.getInt(9));
			product.setCategory(cate);
			products.add(product);
		}
		jdbc.disConnection();
		return products;
	}
	
	public boolean deleteProductById(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM Product WHERE ProductId = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, id);
		int result = preStatement.executeUpdate();
		if (result == 1) {
			System.out.println("da xoa san pham nay");
			jdbc.disConnection();
			return true;
		}else {
			jdbc.disConnection();
			return false;
		}
	}

	public boolean updateProduct(int id, String newUserName) throws SQLException, ClassNotFoundException {
		String sql = "UPDATE Product SET ProductName = ? WHERE ProductId = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setString(1, newUserName);
		preStatement.setInt(2, id);
		int result = preStatement.executeUpdate();
		if (result == 1) {
		jdbc.disConnection();
		return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}
	
	public boolean productNameIsExists(String name,List<Product> products) {
		boolean check = false;
		Iterator<Product> it = products.iterator();
		Product product;
		while(it.hasNext()) {
			 product = it.next();
			if(product.getName().equalsIgnoreCase(name)) {
				check = true;
				break;
			}
		}
		return check;
	}
	
	public boolean addProduct(String name, String price, String infor, String detail) throws SQLException, ClassNotFoundException {
		String sql = "INSERT INTO Product (ProductName,ProductPrice,ProductInfo,ProductDetail,"
				+ "RatingStar,ProductImageName,ManufacturerId,CategoryId) VALUES (?,?,?,?,?,?,?,?);";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setString(1, name);
		preStatement.setString(2, price);
		preStatement.setString(3, infor);
		preStatement.setString(4, detail);
		preStatement.setInt(5, 5);
		preStatement.setString(6, "null");
		preStatement.setString(7, "null");
		preStatement.setInt(8, 0);
		preStatement.setInt(9,0);
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
		jdbc.disConnection();
		return false;
		}
	}

}
