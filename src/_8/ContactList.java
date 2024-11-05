package _8;
import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Memento save() {
        return new Memento(new ArrayList<>(contacts));
    }

    public void restore(Memento memento) {
        this.contacts = memento.getContacts();
    }
}
