/* You are given a phone book that consists of people's names and their phone number. 
 * After that you will be given some person's name as input. For each input, print the phone number of that person. 
 * For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number.
 */
package phoneDirectory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phoneBook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Creating HashMap to represent phone book: Key- contactNo, Value- contactName
		// HashMap<personName, phNumber> phoneBook
		HashMap<Long, String> phoneBook = new HashMap<Long, String>(); // Using Wrapper class Long to store phoneNumber
																		// object

		// isEmpty() method returns true if the map is empty, else false
		System.out.println("Before Adding contacts : ");
		System.out.println(phoneBook.isEmpty() ? "Currently does not have any contact list\n"
				: "Directory has " + phoneBook.size() + " contacts");

		// storing key-value pairs to the map - adding phNo-name to the directory
		phoneBook.put(4351163536L, "Priya");
		phoneBook.put(9873131736L, "Neenu");
		phoneBook.put(4166543431L, "Sanju");
		phoneBook.put(9871654146L, "Vinu");
		phoneBook.put(4164531462L, "Rahul");
		phoneBook.put(6471313462L, "Manu");

		// displays how many contacts been added
		System.out.println("After adding contacts : ");
		System.out.println(phoneBook.isEmpty() ? "Currently does not have any contact list"
				: "Directory has " + phoneBook.size() + " contacts\n");

		// values() returns a collection view of values in the map
//		System.out.println("Displaying the contact person's name list");
//		System.out.println(phoneBook.values());

		// keySet() returns a collection view of keys in the map
//		System.out.println(phoneBook.keySet());

		// entrySet() returns a collection view of mappings in the map
//		System.out.println(phoneBook.entrySet());

		do {

			System.out.println("Please enter the contact name to search");
			String findContact = sc.next();
			boolean isNameInList = false;

			// check if phone book contains the entered name in the value set
			for (Map.Entry<Long, String> entry : phoneBook.entrySet()) {
				if (entry.getValue().equalsIgnoreCase(findContact)) {
					System.out.println("Phone number of " + entry.getValue() + " is : " + entry.getKey());
					isNameInList = true;
					break;
				}
			}

			if (!isNameInList) {
				System.out.println("Contact not found in the list");
			}

			System.out.println("Enter yes to search for another contact");

		} while (sc.next().equalsIgnoreCase("yes"));
		
		sc.close();
	}

}
