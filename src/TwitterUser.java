
public class TwitterUser implements TwitterFollowers {

    private long lastUpdateTime;
	
	public void Notify() {
		System.out.println("New User started following you");
	}

	public void Notify(String n){
		System.out.println(n);
		lastUpdateTime = System.currentTimeMillis();
		System.out.println(lastUpdateTime);
	}

}
