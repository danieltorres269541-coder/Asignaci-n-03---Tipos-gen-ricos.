package universidad;

public abstract class Curso {
    String nombreCurso;
    int codigoCurso;
    private Profesor profesor;

    public Curso(String nombreCurso, int codigoCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.profesor = profesor;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}