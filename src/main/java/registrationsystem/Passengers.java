package registrationsystem;

public class Passengers {
    String firstName;
    String lastname;
    int place;
    String classes;
    public Passengers (String firstName, String lastname, int place, String classes){
        this.firstName = firstName;
        this.lastname = lastname;
        this.place = place;
        this.classes = classes;
    }
    public void printInformation(){
        System.out.println(firstName + " - " + lastname + " - " + place + " - " + classes + " - ");
    }
}
