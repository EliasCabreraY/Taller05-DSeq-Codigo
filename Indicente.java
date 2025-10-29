package sistema;

import java.util.List;

public class Indicente {
    protected int id;
    protected DateTime fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<Indicente> logActualizaciones;
    protected DateTime fechaCerrado;
    protected String tipo;



    public Indicente(int id, DateTime fechaReportado, String estado, String titulo, String descripcion,
        List<Indicente> logActualizaciones, DateTime fechaCerrado, String tipo) {
        this.id = id;
        this.fechaReportado = fechaReportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.logActualizaciones = logActualizaciones;
        this.fechaCerrado = fechaCerrado;
        this.tipo = tipo;
    }




}


