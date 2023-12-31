package lessons.lesson5.lecture.factorymethods3.business;

import java.sql.SQLException;
import java.util.List;

import lessons.lesson5.lecture.factorymethods3.dataaccess.DataAccess;
import lessons.lesson5.lecture.factorymethods3.dataaccess.Dao;
import lessons.lesson5.lecture.factorymethods3.dataaccess.DataAccessFactory;
import lessons.lesson5.lecture.factorymethods3.dataaccess.DataAccessSystem;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Dao dao = new AddressDao();
		DataAccess da = DataAccessFactory.getDataAccess();
		try {
			da.read(dao);
			List<Address> addresses = (List<Address>)dao.getResults();
			//display addresses
		} catch(SQLException e) {
			//handle
		}
		

	}

}
