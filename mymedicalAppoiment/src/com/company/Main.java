package com.company;
import static UI.UIMenu.*;

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

    }


}
