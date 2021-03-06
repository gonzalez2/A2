/* This class keeps any group or users that are
 * added and stores them in the ArrayList.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class UserGroups extends GroupComponent {


	ArrayList<GroupComponent> GroupComponents = new ArrayList<GroupComponent>();
	private String groupName;
	private String groupId;

	//Since this class extends GroupComponent I can use the 
	//protected variable by storing the time and printing out the creation time
	//when ever a new group is created.
	public UserGroups(String newGroupName,String newgroupId){
		groupName = newGroupName;
		groupId = newgroupId;
		creationTime = System.currentTimeMillis();
		System.out.println(creationTime);
	}

	public String getGroupName(){return groupName;}

	public void add(GroupComponent newGroupComponent){
		GroupComponents.add(newGroupComponent);
	}

	public void remove(GroupComponent newGroupComponent){
		GroupComponents.remove(newGroupComponent);
	}

	public GroupComponent getComponent(int componentIndex) {
		return (GroupComponent)GroupComponents.get(componentIndex);
	}

	//This method is suppose to display folders name
	//and everyone is the folder
	public void displayGroupInfo() {

		System.out.println(getGroupName()+ " " + groupId + "\n");
		Iterator<GroupComponent> groupIterator = GroupComponents.iterator();
		while(groupIterator.hasNext()){
			GroupComponent groupInfo = (GroupComponent)
					groupIterator.next();
			groupInfo.displayGroupInfo();
		}	
	}
}
