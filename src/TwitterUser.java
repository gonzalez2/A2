
public class TwitterUser implements TwitterFollowers {

	@Override
	public void Notify() {
		System.out.println("New User started following you");
	}
	
	public void Notify(String n){
		System.out.println(n);
	}

}
