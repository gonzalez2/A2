import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//This class should be an abstract that way
//any class can extend it.
public class NameValidator {

	private idValidate id;

	public NameValidator(){
		id = new idValidate();
	}

	//Method iterates through the list
	//and checks if the Id's are valid id's and displayed 
	//which are valid or not.
	public void Validator(List<String> verification) {

		for(String temp : verification){
			boolean valid = id.validate(temp);
			System.out.println("Username is valid :" + temp + " , " + valid);
		}
	}

	//Puts all id's into new List without duplicates and return new List
	public List<String> SingleId(List<String> removeDuplicates) {

		Set<String> temp = new HashSet<String>(removeDuplicates);
		List<String> NewList = new ArrayList<String>();
		NewList.addAll(temp);
		return NewList;
	}

	//This method checks if an id already exists and displays message
	public void doesitContain (List<String> idList,String name){
		if(idList.contains(name)){
			System.out.println("Sorry IdName:"+ name + " already exist!");
		}
	}
}