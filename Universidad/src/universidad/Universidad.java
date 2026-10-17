package universidad;

public class Universidad {
    
    public static void main(String[] args) {
        Profesor profeFisica = new Profesor("ISW", "DR. Albert Einstein",159753,"einstein@itson.edu.m" );

        CursoPresencial cursoFisica = new CursoPresencial("Aula 203", "Fisica Cuantica", 456951, profeFisica);

        Estudiante e1 = new Estudiante("ISW",5,"Daniel",269541,"daniel@itson.edu.mx");
        Estudiante e2 = new Estudiante("ISW", 5, "Maria", 159753,"maria@itson.edu.mx");

        Inscripcion<CursoPresencial> inscripcionP00 = new Inscripcion<CursoPresencial>(cursoFisica);
        inscripcionP00.inscribirEstudiante(e1);
        inscripcionP00.inscribirEstudiante(e2);

        inscripcionP00.mostrarInscritos();
    }
    
}
