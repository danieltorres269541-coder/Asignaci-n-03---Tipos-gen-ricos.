package universidad;

public class CursoVirtual extends Curso {
    String Plataforma;

    public CursoVirtual(String Plataforma, String nombreCurso, int codigoCurso, Profesor profesor) {
        super(nombreCurso, codigoCurso, profesor);
        this.Plataforma = Plataforma;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }
}