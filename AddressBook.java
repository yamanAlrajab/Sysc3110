import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null) {
            buddies.add(buddy);
        }
    }
    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }


    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("yaman","carleton",613);
        AddressBook buddies = new AddressBook();
        System.out.println(buddy.getName());
        System.out.println("Address Book");
        System.out.println("Address 2");
        System.out.println("I have made a change here");
        buddies.addBuddy(buddy);
        buddies.removeBuddy(0);
    }
}
