package frameWork;

/**
 * Created by Alex on 21.10.2015.
 */
public class Contact {

    public String firstname;
    public String lastname;



    public Contact setFirstName(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public Contact setLastName(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

}
