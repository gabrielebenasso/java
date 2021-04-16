package Model;

public class Owner {
    private String ownerName;
    private String email;
    private int studiosNumber;

    public Owner(String ownerName, String email, int studiosNumber){
        this.email = email;
        this.ownerName = ownerName;
        this.studiosNumber = studiosNumber;
    }
}
