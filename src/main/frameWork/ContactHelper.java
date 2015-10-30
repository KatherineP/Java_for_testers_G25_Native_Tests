package main.frameWork;

/**
 * Created by Alex on 21.10.2015.
 */
public class ContactHelper extends HelpersBase {
    public ContactHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void createContact(Contact contact) {

        initContactCreation();
        fillContactForm(contact);
        confirmContactCreation();
    }

    private void initContactCreation() {
        manager.getAutoItHelper()
                .winWaitAndActivate("AddressBook Portable", "", 5000)
                .click("Add").winWaitAndActivate("Add Contact", "", 5000);
    }
    private void fillContactForm(Contact contact) {
        manager.getAutoItHelper()
                .send("", contact.firstname)
                .send("", contact.lastname);
    }
    private void confirmContactCreation() {
        manager.getAutoItHelper()
                .click("Save")
                .winWaitAndActivate("AddressBook Portable", "", 5000);
    }



}
