package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.vti.backend.businesslayer.ManufacturerService;
import com.vti.entity.Manufacturer;

/**
 * @author Admin
 *
 */
public class ManufacturerController {
	ManufacturerService manuService;

	public ManufacturerController() throws FileNotFoundException, IOException {
		manuService = new ManufacturerService();
	}
	public List<Manufacturer> getManufacturer() throws ClassNotFoundException, SQLException{
		return manuService.getManufacturer();
	}
	
	public void findManu(int id,List<Manufacturer> manus) {
		Iterator<Manufacturer> it = manus.iterator();
		Manufacturer manu;
		while (it.hasNext()) {
			manu = it.next();
			if(manu.getId()==id) {
				System.out.println(manu);
				break;
			}
		}
	}
}
