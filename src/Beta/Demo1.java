package Beta;

//import org.apache.log4j.Logger;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

public class Demo1 {

	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am debugging");
		
			log.info("object is present");
		log.error("object is not present");
		log.fatal("this is fatal");

	}

}
