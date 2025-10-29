package sistema;

public class Profesor extends PersonalAcademico{

    public Profesor(String usuario, String contraseña, String nombre, String apellido){
        super(usuario, contraseña, nombre, apellido);
    }   

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //To implement
    }


    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
        //To implement
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        //To implement;
    }
}
