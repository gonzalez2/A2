//UserGroups and User are to extend this to keep group userGroup and user together
public abstract class GroupComponent {
	protected long creationTime;
	public void add(GroupComponent newGroupComponent){};
	public void remove(GroupComponent newGroupComponent){};
	public GroupComponent getComponent(int componentIndex){return null;};
	public void displayGroupInfo(){};

}
