package ie.atu.exam;

public class Customer {
    public Customer() {
    }
    public String addFirstName(String fName) throws IllegalArgumentException{
        if(fName.length()< 3){
            throw new IllegalArgumentException("must be > 3 chars");
        }
        return fName;
    }
    public String addLastName(String lName) throws IllegalArgumentException{
        if(lName.length()< 3){
            throw new IllegalArgumentException("must be > 3 chars");
        }
        return lName;
    }

    public String addID(String id) {

        return id;
    }
}
