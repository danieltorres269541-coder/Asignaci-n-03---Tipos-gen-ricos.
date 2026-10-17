package universidad;

public class CursoPresencial extends Curso {
    String Aula;

    public CursoPresencial(String Aula, String nombreCurso, int codigoCurso, Profesor profesor) {
        super(nombreCurso, codigoCurso, profesor);
        this.Aula = Aula;
    }

    public String getAula() {
        return Aula;
    }

    public void setAula(String Aula) {
        this.Aula = Aula;
    }
}