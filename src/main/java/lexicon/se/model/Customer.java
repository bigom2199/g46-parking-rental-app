package lexicon.se.model;

public class Customer {
        // Fields
    private String name;
    private String phoneNumber;
    private int id;

    // Constructors
    public Customer(int id,String name,String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Customer(String name,String phoneNumber) {
        this.name = name;
        this.phoneNumber =phoneNumber;
    }
    // Setters & Getters

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    // Methods

}
