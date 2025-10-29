package sistema;

public class Usuario {
    //Atributes
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;


    //Constructor
    public Usuario(String usuario, String contraseña, String nombre, String apellido){
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Methods

    protected boolean logIn(){
        //To implement
        return false;
    }

    protected boolean logOut(){
        return false;
    }
    
}
