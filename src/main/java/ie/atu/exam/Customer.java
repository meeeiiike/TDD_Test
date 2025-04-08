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

    public String addID(String id) throws IllegalArgumentException{
        if(id.length() < 8 || id.length() >12){
            throw new IllegalArgumentException("length must be between 8-12");
        }
        return id;
    }

    public String addAddress(String address) throws IllegalArgumentException {
        if(address.length() < 10 || address.length() >40){
            throw new IllegalArgumentException("length must be between 10-40");
        }
        return address;
    }
}
