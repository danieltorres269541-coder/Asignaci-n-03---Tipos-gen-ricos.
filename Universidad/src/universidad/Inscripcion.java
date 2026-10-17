package universidad;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion<T extends Curso> {
    private T curso;
    private List<Estudiante> estudiante;

    public Inscripcion(T curso){
        this.curso = curso;
        this.estudiante = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante e){
        if (e != null && !estudiante.contains(e)){
            estudiante.add(e);
        }
    }

    public void removerEstudiante(Estudiante e){
        estudiante.remove(e);
    }

    public void mostrarInscritos(){
        System.out.println("Curso: " + curso.getNombreCurso()
                + " (" + curso.getCodigoCurso()
                + ") - Profesor: " + curso.getProfesor().getNombre());
        System.out.println("Estudiantes inscritos: ");
        for (Estudiante e : estudiante){
            System.out.println("- " + e.getNombre() + " (" + e.getID() + ")");
        }

        System.out.println("Total inscritos: " + estudiante.size());
    }
}