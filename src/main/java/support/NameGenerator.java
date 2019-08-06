package support;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class NameGenerator {
	
	public static String CreateName(){
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyymmddhhmmss").format(ts);		
	}

}
