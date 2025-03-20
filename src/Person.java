class Person {
    private Name name;
    private ContactInfo contactInfo;

    public Person(String fullName, String email, String phoneNumber) {
        this.name = new Name(fullName);
        this.contactInfo = new ContactInfo(email, phoneNumber);
    }

    public void displayPersonInfo() {
        name.display();
        contactInfo.display();
    }
}
