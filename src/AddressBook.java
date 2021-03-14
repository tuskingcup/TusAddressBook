
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CLinicIT
 */
public class AddressBook {

    private Contact[] friends;
    private int count;

    public AddressBook(int size) {
        if (size <= 0) {
            friends = new Contact[10];
        }
        else friends = new Contact[size];
    }

    public int getCount() {
        return count;
    }

    public boolean isFull() {
        if (count < friends.length) {
            return false;
        }
        return true;
    }

    public Iterator<Contact> iterator() {
        return getFriend().listIterator();
    }

    public boolean addFriends(Contact contact) {
        if (isFull()) {
            return false;
        }
        friends[count] = contact;
        count++;
        return true;
    }

    public int searchForName(String name) {
        for (int i = 0; i < count; i++) {
            if (friends[i] instanceof BusinessContact) {
                if (((BusinessContact) friends[i]).getCompany().getName().equals(name)) {
                    return i;
                }
            } else if (friends[i] instanceof PersonContact) {
                if (((PersonContact) friends[i]).getPerson().getFirstName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public List<Contact> getFriend(){
    List<Contact> list = new ArrayList<>();
        Collections.addAll(list, friends);
        return list;
    }
}
