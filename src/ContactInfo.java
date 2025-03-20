public class ContactInfo {
    private String email;
    private String phoneNumber;

    public ContactInfo(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }
}
