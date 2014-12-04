
public class Users extends GroupComponent {

	String usersname;

	//Since this class extends GroupComponent I can use the 
	//protected variable by storing the time and printing out the creation time
	//when ever a new user is created.
	public Users(String newUsername){
		usersname = newUsername;
		creationTime = System.currentTimeMillis();
		System.out.println(creationTime);
	}
	public String getName(){
		return usersname;
	}
	public void displayUserInfo(){
		System.out.println(getName());
	}

}
