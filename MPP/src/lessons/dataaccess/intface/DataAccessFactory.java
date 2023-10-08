package lessons.dataaccess.intface;
import lessons.dataaccess.*;
public class DataAccessFactory {
	public static DataAccess newDataAccess() {
		return new DataAccessSubsystemFacade();
	}
}
