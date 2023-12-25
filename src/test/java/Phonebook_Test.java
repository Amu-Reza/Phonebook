/**
 * writing unit tests for each method of classes
 * If you have no idea about how to write unit tests, you can search the internet or check your first assignment
 * After each unit test you've written, please commit the changes and push to your repo

 * Hint: Your test coverage should be 100%
 * Attention:  We would check your commits and it will affect your score
 */
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
public class Phonebook_Test {
    @Test
    public void testGetPhoneNumber() {
        Person person = new Person("Ali","09124238971");
        Person person1 = new Person("Javad","09124179069");

        Phonebook phonebook = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        Assertions.assertEquals("09124238971",phonebook.getPhoneNumber("Ali"));
        Assertions.assertEquals("Contact Not Found",phonebook.getPhoneNumber("Sara"));
    }

    @Test
    public void testGetContact(){

        Person person = new Person("Ali","09124238971");
        Person person1 = new Person("Javad","09124179069");

        Phonebook phonebook = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        Assertions.assertEquals(1,phonebook.getContact("Ali"));
        Assertions.assertEquals(0,phonebook.getContact("Sara"));
    }

    @Test
    public void testUpdateContactName(){

        Person person = new Person("Ali","09124238971");
        Person person1 = new Person("Javad","09124179069");

        Phonebook phonebook = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        Assertions.assertEquals(1,phonebook.updateContactName("Ali","Majid"));
        Assertions.assertEquals(0,phonebook.updateContactName("Sara","Ali"));
    }
}
