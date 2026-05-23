import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void displayContact() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
        System.out.println("---------------------------");
    }
}

public class ContactManagementSystem {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addContact();
                    break;

                case 2:
                    viewContacts();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    deleteContact();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    static void addContact() {

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        contacts.add(new Contact(name, phone, email));

        System.out.println("Contact Added Successfully!");
    }

    static void viewContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts available!");
            return;
        }

        System.out.println("\n===== CONTACT LIST =====");

        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact ID: " + i);
            contacts.get(i).displayContact();
        }
    }

    static void updateContact() {

        viewContacts();

        if (contacts.isEmpty()) {
            return;
        }

        System.out.print("Enter Contact ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (id >= 0 && id < contacts.size()) {

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Phone: ");
            String phone = sc.nextLine();

            System.out.print("Enter New Email: ");
            String email = sc.nextLine();

            contacts.set(id, new Contact(name, phone, email));

            System.out.println("Contact Updated Successfully!");

        } else {
            System.out.println("Invalid Contact ID!");
        }
    }

    static void deleteContact() {

        viewContacts();

        if (contacts.isEmpty()) {
            return;
        }

        System.out.print("Enter Contact ID to Delete: ");
        int id = sc.nextInt();

        if (id >= 0 && id < contacts.size()) {

            contacts.remove(id);

            System.out.println("Contact Deleted Successfully!");

        } else {
            System.out.println("Invalid Contact ID!");
        }
    }
}