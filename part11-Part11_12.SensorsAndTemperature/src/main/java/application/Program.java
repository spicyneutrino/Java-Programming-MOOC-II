package application;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        // The returned list should have been empty with the code:
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new StandardSensor(3));
        ka.addSensor(new StandardSensor(7));
        ka.readings();
    }

}
