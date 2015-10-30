package main.frameWork;

/**
 * Created by Alex on 21.10.2015.
 */
public class Contact {

    public String firstname;
    public String lastname;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (firstname != null ? !firstname.equals(contact.firstname) : contact.firstname != null) return false;
        if (lastname != null ? !lastname.equals(contact.lastname) : contact.lastname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

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
