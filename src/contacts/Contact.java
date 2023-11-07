package contacts;

public class Contact {
    private String name;
    private String mobile;
    private String email;

//    setter
    public void setName(String name) {
        this.name = name;
    }

    public  String checkNull(String contactProperty) {
        return contactProperty == null ? "" : contactProperty;
    }

    public String display() {
        return String.format(
                "Name: %s%n" +
                        "Mobile: %s%n" +
                        "Email: %s%n",
                name, checkNull(mobile), checkNull(email)
        );
    }

    public Contact() {
        System.out.println("New contact!");
    }

    private static int totalContacts;


//    this can override default constructor
    public Contact(String name, String mobile, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public static int getTotalContacts() {
        return totalContacts;
    }


}
