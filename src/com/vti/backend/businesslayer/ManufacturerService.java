package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.ManufacturerRepository;
import com.vti.entity.Manufacturer;

/**
 * @author Admin
 *
 */
public class ManufacturerService {
	ManufacturerRepository repository;

	public ManufacturerService() throws FileNotFoundException, IOException {
		repository = new ManufacturerRepository();
	}
	public List<Manufacturer> getManufacturer() throws ClassNotFoundException, SQLException{
		return repository.getListManufacturer();
	}
}
