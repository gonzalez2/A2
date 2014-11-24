import java.util.ArrayList;


public class TwitterAccount {

	private ArrayList<TwitterFollowers> followers = new ArrayList<TwitterFollowers>();

	public void follow(TwitterFollowers user){

		followers.add(user);
	}
	
	public void unFollow(TwitterFollowers user){
		followers.remove(user);
	}
	
	public void notifyFollowers(){

		for(TwitterFollowers user : followers ){
			user.Notify();
		}
	}
	
	public void notifyFollowers(String n){

		for(TwitterFollowers user : followers ){
			user.Notify(n);
		}
	}
}
