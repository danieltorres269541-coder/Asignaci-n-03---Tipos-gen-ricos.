package universidad;

public class Estudiante extends Persona {
    String Carrera;
    int Semestre;

    public Estudiante(String Nombre, int ID, String Correo, String carrera, int semestre) {
        super(Nombre, ID, Correo);
        Carrera = carrera;
        Semestre = semestre;
    }

    public Estudiante(String Carrera, int Semestre, String Nombre, int ID, String Correo) {
        super(Nombre, ID, Correo);
        this.Carrera = Carrera;
        this.Semestre = Semestre;
    }

    public Estudiante(String Carrera, int Semestre) {
        this.Carrera = Carrera;
        this.Semestre = Semestre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }
}