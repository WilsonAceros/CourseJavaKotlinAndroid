package model;

public class Nurse extends User {
    @Override
    public void showDataUser() {
        System.out.println("Empleado Hospital: Cruz Verde");
        System.out.println("Departamento: Cancerologia, Pediatria");
    }

    private String speciality;

    public Nurse (String name, String email){
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
