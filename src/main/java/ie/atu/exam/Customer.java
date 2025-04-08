package ie.atu.exam;

public class Customer {
    public Customer() {
    }
    public String addFirstName(String fName) throws Exception{
        if(fName.length()< 3){
            throw new Exception("must be > 3 chars");
        }
        return fName;
    }
}
