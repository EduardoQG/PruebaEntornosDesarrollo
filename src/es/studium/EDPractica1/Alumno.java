package es.studium.EDPractica1;

// Creamos la clase Alumno:
public class Alumno {      
	
	
/* Estos son los atributos de la clase Alumno, se encapsulan como 'private' para que solo sean accesibles desde la propia clase.
 * Para las cadenas de texto, declaramos variables tipo String, para los n�meros enteros, se usan variables tipo int, y tipo float
 * para los n�meros decimales. Los atributos 'Centro' y 'Asignatura' son de tipo Objeto, y debemos crear previamente una clase de
 * este tipo para usarlos.
 */
	private String nombre;        
	private String direccion;
	private int numeroMatricula;
	private float nota;
	private Centro centro;
	private Asignatura asignatura;
	
	//wegwe
	
	/* Los constructores son m�todos utilizados para instanciar las clases en el m�todo main. Su encapsulaci�n es 'public', ya
	 * que debemos acceder a ellos desde la clase principal.
	 * 
	 * 
	 * El siguiente es el constructor vac�o. No recibe par�metros. Al crear un objeto con este constructor, todos los atributos
	 * adquieren el valor por defecto.
	 */
	
	public Alumno() {
		
		nombre = "";
		direccion = "";
		numeroMatricula = 0;
		nota = 0;
		centro = new Centro ();
		asignatura = new Asignatura();
	}
	
	
	/* El siguiente es el constructor por par�metros. Al crear el objeto, le indicamos a trav�s de estos par�metros, qu� valores
	 * queremos que adquieran sus atributos. 
	 */
	
	public Alumno(String nombre, String direccion, int numeroMatricula, float nota, Centro centro,
			Asignatura asignatura) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroMatricula = numeroMatricula;
		this.nota = nota;
		this.centro = centro;
		this.asignatura = asignatura;
	}

	

	/* Los siguientes son los m�todos inspectores Getter y Setter. Su encapsulaci�n es 'public', ya que debemos poder acceder a 
	 * ellos desde la clase principal.
	 * 
	 * Los m�todos Getter se utilizan para obtener un atributo de una clase, por eso tienen un retorno. El tipo de variable que
	 * retornan se define antes del nombre del m�todo.
	 * 
	 * Los m�todos Setter se utilizan para cambiar el valor de un atributo de la clase. No tienen retorno (void). A trav�s de los
	 * par�metros, le pasamos el valor que le queremos dar a la variable.
	 */
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}


	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}


	public float getNota() {
		return nota;
	}


	public void setNota(float nota) {
		this.nota = nota;
	}


	public Centro getCentro() {
		return centro;
	}


	public void setCentro(Centro centro) {
		this.centro = centro;
	}


	public Asignatura getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
		

}
