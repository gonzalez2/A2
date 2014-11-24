
public class Users extends GroupComponent {

	String usersname;

	public Users(String newUsername){
		usersname = newUsername;
	}
	public String getName(){
		return usersname;
	}
	public void displayUserInfo(){
		System.out.println(getName());
	}

}
