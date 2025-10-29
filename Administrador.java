package sistema;

public class Administrador extends Usuario{

    //Constructor
    public Administrador(String usuario, String contraseña, String nombre, String apellido){
        super(usuario, contraseña, nombre, apellido);

    }
    //Methods
    public void crearUsuarioConRol(String usuario, String contraseña){
        //To implement
    }
    
    public void asignarPermiso(String usuario){
        //To implement
    }

    public void actualizarSoftware(){
        //To implement
    }

    public void asignarRespomsable(Curso curso, Profesor profesor){
        //To implement
    }



}
