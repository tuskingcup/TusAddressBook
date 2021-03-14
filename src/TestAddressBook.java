
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CLinicIT
 */
public class TestAddressBook {

    public static void testCreatePersonContact() {
        try {
            PersonContact myPersonContact = new PersonContact(new Address("55", "", "", ""), "", "", ContactType.PERSON, new Person("Rapeepat", "Klanjeen"), LocalDate.of(2001, Month.OCTOBER, 30));
        } catch (Exception e) {
            System.out.println("error naja" + e.toString());
        }
    }

    public static void testCreateBusinessContact() {
        try {
            BusinessContact myBysunessContact = new BusinessContact(new Address("", "", "", ""), "", "", ContactType.BUSINESS, new Company("TusKungTech"), "EiEi");
        } catch (Exception e) {
            System.out.println("error naja" + e.toString());
        }
    }

    public static AddressBook testAddContact() {
        try {
            AddressBook book = new AddressBook(0);
            PersonContact myPersonContact = new PersonContact(new Address("55", "", "", ""), "", "", ContactType.PERSON, new Person("Rapeepat", "Klanjeen"), LocalDate.of(2001, Month.OCTOBER, 30));
            BusinessContact myBusinessContact = new BusinessContact(new Address("", "", "", ""), "", "", ContactType.BUSINESS, new Company("TusKungTech"), "EiEi");
            book.addFriends(myPersonContact);
            book.addFriends(myBusinessContact);
            return book;
        } catch (Exception e) {
            System.out.println("error naja" + e.toString());
            return null;
        }

    }

    public static void testSortContact() {
        try {
            AddressBook book = new AddressBook(2);
            PersonContact myPersonContact = new PersonContact(new Address("55", "d", "s", "e"), "t", "s", ContactType.PERSON, new Person("Rapeepat", "Klanjeen"), LocalDate.of(2001, Month.OCTOBER, 30));
            BusinessContact myBusinessContact = new BusinessContact(new Address("d", "s", "d", "f"), "a", "r", ContactType.BUSINESS, new Company("TusKungTech"), "EiEi");
            System.out.println(book.addFriends(myPersonContact));
            System.out.println(book.addFriends(myBusinessContact));
            System.out.println(book.getFriend());
            Collections.sort(book.getFriend(), new Contact.contactTypeComparator());
        } catch (Exception e) {
            System.out.println("error naja" + e.toString());
        }

    }

    public static void main(String[] args) {
        testCreatePersonContact();
        testCreateBusinessContact();
        testAddContact();
        testSortContact();
    }
}
