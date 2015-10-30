package main.tests;

import main.frameWork.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alex on 21.10.2015.
 */
public class TestContactCreation extends TestBase{

    @Test
    public void shouldCreateContactWithValidData(){
        Contact contact = new Contact().setFirstName("tester").setLastName("tester");
        app.getContactHelper().createContact(contact);
    Contact createdContact = app.getContactHelper().getFirstContact();
        Assert.assertEquals(contact, createdContact);
    }
}
