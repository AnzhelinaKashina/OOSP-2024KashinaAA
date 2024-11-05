package _8;


public class Main {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Caretaker caretaker = new Caretaker();

        contactList.addContact(new Contact("Анжелика", "89515472872"));
        contactList.addContact(new Contact("Алиса", "89525742971"));
        caretaker.addMemento(contactList.save());

        contactList.addContact(new Contact("Константин Ивлев", "89081439180"));
        System.out.println("Список контактов: " + contactList.getContacts());

        contactList.restore(caretaker.getMemento(0));
        System.out.println("После восстановления: " + contactList.getContacts());
    }
}
