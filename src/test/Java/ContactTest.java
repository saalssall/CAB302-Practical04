package Java;

import com.example.addressbook.model.Contact;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    private Contact contact;

    @BeforeEach
    public void setUp() {
        contact = new Contact("Hamid", "Rezae",
                "hamidrezae12@gmail.com", "1234567890");
    }

    @Test
    public void testGetId() {
        contact.setId(1);
        assertEquals(1, contact.getId());
    }
    @Test
    public void testGetFirstName() {
        assertEquals("Hamid", contact.getFirstName());
    }
    @Test
    public void testSetFirstName() {
        contact.setFirstName("Ali");
        assertEquals("Ali", contact.getFirstName());
    }
    @Test
    public void testGetLastName() {
        assertEquals("Rezae", contact.getLastName());
    }
    @Test
    public void testSetLastName() {
        contact.setLastName("John");
        assertEquals("John", contact.getLastName());
    }
    @Test
    public void testGetEmail() {
        assertEquals("hamidrezae12@gmail.com", contact.getEmail());
    }

    @Test
    public void testSetEmail() {
        contact.setEmail("hamidrezae12@gmail.com");
        assertEquals("hamidrezae12@gmail.com",  contact.getEmail());
    }
    @Test
    public void testGetPhone() {
        assertEquals("1234567890", contact.getPhone());
    }
    @Test
    public void testSetPhone() {
        contact.setPhone("0987654321");
        assertEquals("0987654321", contact.getPhone());
    }
    @Test
    public void testGetFullName() {
        assertEquals("Hamid Rezae", contact.getFullName());
    }

}
