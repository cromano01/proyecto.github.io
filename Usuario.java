
//inicio de clase Usuario
public class Usuario{
	
//atributos o variables de clase
	private String nombre1;
    private String nombre2;
    private String apllidomat;
    private String apllidopat;
    private String email;
    private String nickname;
    private int[] fechaDeNacimiento;

//contructor sin parametros
    public Usuario()
    {


    }

//contructor con parametros
    public Usuario(String nombre1, String nombre2, String apllidopat, String apllidomat, String email)
    {
    	this.nombre1 = nombre1;
    	this.nombre2 = nombre2;
    	this.apllidopat = apllidopat;
    	this.apllidomat = apllidomat;
    	this.email = email;
        this.nickname = nickname;
        this.fechaDeNacimiento = fechaDeNacimiento;

    }

   
    //metodos asignar y obtener
    public String obtenerNombre1() {
        return nombre1;
    }

    public void asignarNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String obtenerNombre2() {
        return nombre2;
    }

    public void asignarNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String obtenerApllidopat() {
        return apllidopat;
    }

    public void asignarApllidopat(String apllidopat) {
        this.apllidopat = apllidopat;
    }

    public String obtenerApllidomat() {
        return apllidomat;
    }

    public void asignarApllidomat(String apllidomat) {
        this.apllidomat = apllidomat;
    }



    public String obtenerEmail() {
        return email;
    }

    public void asignarEmail(String email) {
        this.email = email;
    }

        public String obtenerNickname() {
        return nickname;
    }

    public void asignarNickname(String nickname) {
        this.nickname = nickname;
    }

    public int[] obtenerFechaDeNacim() {
        return fechaDeNacim;
    }

    public void asignarFechaDeNacim(int[] fechaDeNacim) {
        this.fechaDeNacim = fechaDeNacim;
    }
   
    
//método toString para concatenar en forma de texto las variables de forma que el texto tenga sentido
    public String toString(){

    	return "Hola "+nombre1+" "+nombre2+" "+apllidopat+" "+apllidomat+"\n y tu email es: "+email; 
    }
    
}// fin de clase Usuario