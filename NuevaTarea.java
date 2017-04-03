

//inicio de la clase NuevaTarea
public class NuevaTarea{

//Atributos o variables de clase	
    private String nombre;
    private int fechaIni;
    private int horaIni;
    private int duracion;
    private int frecuencia;
    private int fechaFin;
    private int horaFin;

//contructor sin parametros
public NuevaTarea(){ }
    

// metodos asignar y obtener
    public String obtenerNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerFechaIni() {
        return fechaIni;
    }

    public void asignarFechaIni(int fechaIni) {
        this.fechaIni = fechaIni;
    }

    public int obtenerHoraIni() {
        return horaIni;
    }

    public void asignarHoraIni(int horaIni) {
        this.horaIni = horaIni;
    }

    public int obtenerDuracion() {
        return duracion;
    }

    public void asignarDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int obtenerFrecuencia() {
        return frecuencia;
    }

    public void asignarFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int obtenerFechaFin() {
        return fechaFin;
    }

    public void asignarFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int obtenerHoraFin() {
        return horaFin;
    }

    public void asignarHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
    
   
} //fin de la clase