package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Manufacturer;
import com.vti.utils.JdbcUtils;

/**
 * @author Admin
 *
 */
public class ManufacturerRepository {
	private JdbcUtils jdbc;
	
	public ManufacturerRepository() throws FileNotFoundException, IOException {
		jdbc = new JdbcUtils();
	}

	public List<Manufacturer> getListManufacturer() throws ClassNotFoundException, SQLException{
			List<Manufacturer> manus = new ArrayList<>();
			String sql = "SELECT * FROM Manufacturer";
			ResultSet result = jdbc.executeQuery(sql);
			while(result.next()) {
				Manufacturer manu = new Manufacturer();
				manu.setId(result.getInt(1));
				manu.setName(result.getString(2));
				manus.add(manu);
			}
			jdbc.disConnection();
			return manus;
	}
}
