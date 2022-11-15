public class IndividualClient extends Client {

    private String firstName;
    private String lastName;

    public IndividualClient(long clientID, String firstName, String lastName) {
        super(clientID);

        this.setFirstName(firstName);
        this.setLastName(lastName);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
