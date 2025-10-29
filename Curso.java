package sistema;

import sistema.Foro;
import java.util.List;

public class Curso {
   private String id;
   private String nombre;
   private boolean estadoDisponible; 
   public List<Foro> foro;

   public Curso(String id, String nombre, boolean estadoDisponible){
    this.id = id;
    this.nombre = nombre;
    this.estadoDisponible = estadoDisponible;
   }
}
