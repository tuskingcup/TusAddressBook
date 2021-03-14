
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
public abstract class Contact {

    private Address address;
    private String email;
    private String phone;
    private ContactType type;

    public static class contactTypeComparator implements Comparator<Contact> {
        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.getType().compareTo(o2.getType());
        }
    };

    public Contact(Address address, String email, String phone, ContactType type) {
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.type = type;
    }
    
    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public ContactType getType() {
        return type;
    }



}
