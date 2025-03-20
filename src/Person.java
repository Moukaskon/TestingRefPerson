class Person {
    private String name;
    private ContactInfo contactInfo;

    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.contactInfo = new ContactInfo(email, phoneNumber);
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        contactInfo.display();
    }
}
