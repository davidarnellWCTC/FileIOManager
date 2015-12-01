
package fileiomanager;

import java.util.Objects;

/**
 *
 * NOT USING THIS CLASS
 * 
 * THIS CLASS IS NOT USED FOR THIS PROJECT
 * 
 * THERE ARE A FEW THINGS IN THIS CLASS I WANT TO COPY TO ANOTHER PROJECT. I'LL
 * DELETE IT WHEN I DON'T NEED ANYTHING ELSE FROM HERE.
 * 
 * @author darnell
 */
public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;

    private String key; // The key is what will be used to look up the Contact

    public Contact() {
    }

    public Contact(String firstName, String lastName, String streetAddress, String city, String state, String zip, String key) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.key);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contact #" + key + ": " + firstName + " " + lastName;
    }

    @Override
    public int compareTo(Contact o) {
        // Gets the values of this Contact and the compared Contact and parses
        // the int value of each one.
        int thisContact = 0;
        int compareContact = 0;
        
        try{
        thisContact = Integer.parseInt(key);
        compareContact = Integer.parseInt(o.getKey());
        } catch (NumberFormatException nfe) {
            System.out.println("Check Contact Keys for: "
                    + this.toString() + " and " + o.toString());
        }

        return thisContact > compareContact ? 1 : thisContact < compareContact ? -1 : 0;               
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
