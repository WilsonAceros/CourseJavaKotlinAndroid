package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    @Override
    public void showDataUser() {
        System.out.println("Empleado Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }

    private String speciality;

    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
/*
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }*/



    /*
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }*/

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString()+"Doctor{" +
                "speciality='" + speciality + '\n' +
                ", availableAppointments=" + availableAppointments +
                '}';
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {

            return id;
        }

        public void setId(int id) {

            this.id = id;
        }

        public Date getDate() {

            return date;
        }

        public void setDate(Date date) {

            this.date = date;
        }

        public String getTime() {

            return time;
        }

        public void setTime(String time) {

            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment{" +
                    "id=" + id + '\n' +
                    ", date=" + date + '\n' +
                    ", time='" + time + '\n' +
                    '}';
        }
    }

}