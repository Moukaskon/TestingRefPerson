class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void displayContactInfo() {
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        displayContactInfo();
    }
}
