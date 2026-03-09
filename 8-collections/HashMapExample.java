/* What is a HashMap?

A HashMap stores data in key → value pairs.

Example idea:

Key	Value
"name"	"Erkan"
"age"	25
"city"	"Berlin" */

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, String> countryCapital = new HashMap<>();

        // Add key-value pairs
        countryCapital.put("Germany", "Berlin");
        countryCapital.put("France", "Paris");
        countryCapital.put("Italy", "Rome");

        // Print map
        System.out.println(countryCapital);

        // Access value by key
        System.out.println("Capital of Germany: " + countryCapital.get("Germany"));

        // Remove entry
        countryCapital.remove("France");

        // Size of map
        System.out.println("Size: " + countryCapital.size());

        // Loop through HashMap
        for (String country : countryCapital.keySet()) {
            System.out.println(country + " -> " + countryCapital.get(country));
        }
    }
}

// OUTPUT:

/*

{Italy=Rome, France=Paris, Germany=Berlin}
Capital of Germany: Berlin
Size: 2
Italy -> Rome
Germany -> Berlin

*/


/* 

Important HashMap Methods
Method	What it does
put()	adds key-value pair
get()	gets value by key
remove()	deletes entry
size()	number of elements
keySet()	returns all keys 

*/
