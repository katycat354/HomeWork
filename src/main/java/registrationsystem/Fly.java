package registrationsystem;

import java.util.ArrayList;
import java.util.List;

public class Fly {

    String timedeparture;
    String destination;
    List<Passengers> Passengers = new ArrayList<>();
    String flightNumber;

    public Fly(String timedeparture, String destination, String flightNumber) {
        this.timedeparture = timedeparture;
        this.destination = destination;
        this.flightNumber = flightNumber;
    }

    public void printEmployee() {
        for (int i = 0; i < Passengers.size(); i++) {
            Passengers passengers = Passengers.get(i);
            passengers.printInformation();
        }
        public void printInformation() {
            System.out.println(flightNumber);
        }
        }
}

