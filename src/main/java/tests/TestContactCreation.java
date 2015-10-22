package tests;

import frameWork.Contact;
import org.testng.annotations.Test;

/**
 * Created by Alex on 21.10.2015.
 */
public class TestContactCreation extends TestBase{

    @Test
    public void shouldCreateContactWithValidData(){
        Contact contact = new Contact().setFirstName("tester").setLastName("tester");
        app.getContactHelper().createContact(contact);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
