package es.studium.EDPractica1;

// Creamos la clase asignatura:
public class Asignatura {
	
	/* Estos son los atributos de la clase Asignatura, se encapsulan como 'private' para que solo sean accesibles desde la propia clase.
	 * Para las cadenas de texto, declaramos variables tipo String y para los números enteros se usan variables tipo int.
	 */
	private String nombre;
	private int numeroHoras;
	private String codigo;
	
	
	/* Los constructores son métodos utilizados para instanciar las clases en el método main. Su encapsulación es 'public', ya
	 * que debemos acceder a ellos desde la clase principal.
	 * 
	 * El siguiente es el constructor vacío. No recibe parámetros. Al crear un objeto con este constructor, todos los atributos
	 * adquieren el valor por defecto.
	 */
	public Asignatura() {
		
		nombre = "";
		numeroHoras = 0;
		codigo = "";
	}
	
	/* El siguiente es el constructor por parámetros. Al crear el objeto, le indicamos a través de estos parámetros, qué valores
	 * queremos que adquieran sus atributos. 
	 */
	public Asignatura(String nombre, int numeroHoras, String codigo) {
		
		this.nombre=nombre;
		this.numeroHoras=numeroHoras;
		this.codigo=codigo;
	}
	
	
	/* Los siguientes son los métodos inspectores Getter y Setter. Su encapsulación es 'public', ya que debemos poder acceder a 
	 * ellos desde la clase principal.
	 * 
	 * Los métodos Getter se utilizan para obtener un atributo de una clase, por eso tienen un retorno. El tipo de variable que
	 * retornan se define antes del nombre del método.
	 * 
	 * Los métodos Setter se utilizan para cambiar el valor de un atributo de la clase. No tienen retorno (void). A través de los
	 * parámetros, le pasamos el valor que le queremos dar a la variable.
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
