package universidad;

public class Profesor extends Persona {
    String Departamento;

    public Profesor(String Departamento, String Nombre, int ID, String Correo) {
        super(Nombre, ID, Correo);
        this.Departamento = Departamento;
    }

    public Profesor(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
}