

public class BuddyInfo {

    private Integer phoneNumber;
    private String name;
    private String address;

    public BuddyInfo(String name, String address, Integer phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Yaman","carleton",220);
        String buddyName = buddy.getName();
        System.out.println("Buddy's name: " + buddyName);
        System.out.println("AdressBook");
    }
}
