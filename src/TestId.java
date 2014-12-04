import java.util.ArrayList;
import java.util.List;

public class TestId  {

	//This was the test class to see if NameValidator.java 
	//and idValidate.java worked. It does work if names are stored in a 
	//list.
	public static void main (String[] args){

		NameValidator test = new NameValidator();
		List<String> id = new ArrayList<String>();
		id.add("Cesar");
		id.add("Cesar110!!");
		id.add("cesar fd");
		id.add("Cesar131");
		id.add("Cesar1423 Gon");
		test.doesitContain(id, "Cesar131");
		id.add("Cesar1_423-Gon");

		//Send the list and prints out all the id that 
		//are good id and all that are bad.
		List<String> idVerified = test.SingleId(id);
		System.out.println("---------------------------------------");
		test.Validator(idVerified);

	}
}