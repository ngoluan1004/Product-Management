package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.vti.backend.presentationlayer.ManufacturerController;
import com.vti.backend.presentationlayer.ProductController;

import com.vti.entity.Product;
import com.vti.utils.JdbcUtils;

/**
 * @author Admin
 *
 */
public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		JdbcUtils jdbc = new JdbcUtils();
		jdbc.getConnection();
		int choose;
		
		while (true) {
			String leftAlignFormat = "| %-70s |%n";
			System.out.format("+------------------------------------------------------------------------+%n");
			System.out.format("| MOI BAN CHON CHUC NANG 						 |%n");
			System.out.format("+------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1.tim kiem nha san xuat theo ID");
			System.out.format(leftAlignFormat, "2.xem danh sach thong tin san pham tren he thong ");
			System.out.format(leftAlignFormat, "3.xoa san pham theo id");
			System.out.format(leftAlignFormat, "4.cap nhat ten cua san pham dang co");
			System.out.format(leftAlignFormat, "5.them moi 1 san pham");
			System.out.format(leftAlignFormat, "6.chuc nang kiem tra email");
			System.out.format(leftAlignFormat, "7.exit");
			System.out.format("+------------------------------------------------------------------------+%n");
			System.out.println("moi ban chon: ");
			Scanner sc = new Scanner(System.in);
			choose = sc.nextInt();
			switch (choose) {
			case 1:
				ManufacturerController manucontrol= new ManufacturerController();
				System.out.println("nhap vao id nha san xuat ban can tim: ");
				int x = sc.nextInt(); 
				manucontrol.findManu(x, manucontrol.getManufacturer());
				break;
				
			case 2:
				ProductController proControl= new ProductController();
				List<Product> products = proControl.getListProduct();
				System.out.println("danh sach thong tin san pham");
				for(Product product : products)
					System.out.println(product);
				break;
				
			case 3:
				ProductController proControl1= new ProductController();
				System.out.println("nhap id cua san pham can xoa: ");
				int y = sc.nextInt();
				proControl1.deleteProductById(y);
				break;
				
			case 4: 
				ProductController proControl2 = new ProductController();
				System.out.println("nhap id san pham ban muon update: ");
				int id = sc.nextInt();
				System.out.println("nhap ten moi cho san pham: ");
				String newname = sc.nextLine();
				proControl2.updateProduct(id, newname);
				break;
				
			case 5:
				ProductController proControl3= new ProductController();
				System.out.println("nhap ten san pham: ");
				String namee = sc.nextLine();
				System.out.println("nhap gia san pham: ");
				String price = sc.nextLine();
				System.out.println("nhap thong tin san pham: ");
				String infor = sc.nextLine();
				System.out.println("nhap chi tiet mo ta: ");
				String detail = sc.nextLine();

				proControl3.addProduct( namee, price, infor, detail);
				break;
			case 6:
				System.out.println("kiem tra tai khoan email");
				break;
			case 7:
				System.exit(0);
				break;
			default:
			System.out.println("hay nhap so tu 1-7:");
			break;
			}
		}
	}
}

