package com.company;
import static UI.UIMenu.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor.id++;

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        System.out.println(Doctor.id);
        */

        //showMenu();

        Doctor myDoctor = new Doctor("Alejandro Rodriguez","Pediatra");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        //myDoctor.showName();

        System.out.println(myDoctor);

        Enumerations enumerar = new Enumerations();

        enumerar.saveValor ();

        int i=0;
        int b=2;
        b=i;

        String name = "Wilson";

        Patient patient = new Patient("Wilson", "wilson.acerosc@gmail.com");
        Patient patient2 = new Patient("Marce", "marce.sanchez@gmail.com");
        System.out.println(patient);
        System.out.println(patient2);
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2=patient;
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient.setWeight(60.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456795");
        System.out.println(patient.getPhoneNumber());
    }


}
