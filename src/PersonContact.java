
import java.time.LocalDate;
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
public class PersonContact extends Contact{

    private Person person;
    private LocalDate dateOfBirth;
    private Comparator<PersonContact> firstNameComparator = new Comparator<PersonContact>() {
        @Override
        public int compare(PersonContact o1, PersonContact o2) {
            return o1.getPerson().getFirstName().compareTo(o2.getPerson().getFirstName());
        }
    };
    private Comparator<PersonContact> lastNameComparator = new Comparator<PersonContact>() {
        @Override
        public int compare(PersonContact o1, PersonContact o2) {
            return o1.getPerson().getLastName().compareTo(o2.getPerson().getLastName());
        }
    };

    public PersonContact(Address address, String email, String phone, ContactType cType, Person person,LocalDate dateOfBirth) {
        super(address, email, phone, cType);
        this.person = person;
        this.dateOfBirth = dateOfBirth;
    }

    public Person getPerson() {
        return person;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "PersonContact{" + "person=" + person + ", dateOfBirth=" + dateOfBirth + '}';
    }
    
    
    
    

}
