package lessons.lesson10.lecture.jdbc.framework.dataaccess.intface;
import lessons.dataaccess.*;
public class DataAccessFactory {
	public static lessons.dataaccess.DataAccess getDataAccess() {
		return new DataAccessSubsystemFacade();
	}
}
