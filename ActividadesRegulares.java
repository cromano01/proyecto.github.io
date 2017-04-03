



//Clase
public class ActividadesRegulares{
//Variables de clase o atributos	
    private String nombre;
	private int fechaIni;
       	private int horaIni;
	private int duracion;
       	private int frecuencia;

//contructor
public ActividadesRegulares(){

    
}
//Métodos obtener y asignar
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


} //fin de la clase