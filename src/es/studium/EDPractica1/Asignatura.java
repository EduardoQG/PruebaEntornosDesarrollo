package es.studium.EDPractica1;

// Creamos la clase asignatura:
public class Asignatura {
	
	/* Estos son los atributos de la clase Asignatura, se encapsulan como 'private' para que solo sean accesibles desde la propia clase.
	 * Para las cadenas de texto, declaramos variables tipo String y para los n�meros enteros se usan variables tipo int.
	 */
	private String nombre;
	private int numeroHoras;
	private String codigo;
	
	
	/* Los constructores son m�todos utilizados para instanciar las clases en el m�todo main. Su encapsulaci�n es 'public', ya
	 * que debemos acceder a ellos desde la clase principal.
	 * 
	 * El siguiente es el constructor vac�o. No recibe par�metros. Al crear un objeto con este constructor, todos los atributos
	 * adquieren el valor por defecto.
	 */
	public Asignatura() {
		
		nombre = "";
		numeroHoras = 0;
		codigo = "";
	}
	
	/* El siguiente es el constructor por par�metros. Al crear el objeto, le indicamos a trav�s de estos par�metros, qu� valores
	 * queremos que adquieran sus atributos. 
	 */
	public Asignatura(String nombre, int numeroHoras, String codigo) {
		
		this.nombre=nombre;
		this.numeroHoras=numeroHoras;
		this.codigo=codigo;
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

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
