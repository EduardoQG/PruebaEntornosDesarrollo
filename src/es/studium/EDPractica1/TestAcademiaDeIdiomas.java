package es.studium.EDPractica1;

public class TestAcademiaDeIdiomas {

	/* Este es el método main. Desde este método se empieza a ejecutar un programa Java. En este método crearemos instancias de las clases
	 * creadas previamente y llevaremos a cabo los ejercicios.
	 */
	public static void main(String[] args) {
		
		/* Creamos primero los centros y las asignaturas utilizando los constructores por parámetros. Hay que pasarle los parámetros según el orden
		 * definido en la clase.
		 */
		Centro CIngles = new Centro ("Escuela de Inglés", "Reyes Católicos, 14", "4576A");
		Centro CFrances = new Centro ("Escuela de francés", "Cristóbal Colón, 92", "8674H");
		
		Asignatura inglesB1 = new Asignatura ("Inglés B1", 5, "435S");
		Asignatura inglesB2 = new Asignatura ("Inglés B2", 7, "234S");
		Asignatura francesA2= new Asignatura ("Francés A2", 3, "437F");
		Asignatura francesB1 = new Asignatura ("Francés B1", 3, "231F");
		
		/* Creamos los alumnos utilizando el constructor por parámetros. Había que instanciar previamente los Centros y Asignaturas para
		 * poder pasarle estos objetos a los alumnos.
		 */
		Alumno anaAbel = new Alumno ("Ana Abel", "Paseo de América, 15", 35, 7, CIngles, inglesB1);
		Alumno benitoBueno = new Alumno ("Benito Bueno", "Reyes Católicos, 16", 12, 6, CIngles, inglesB2);
		Alumno carmenCano = new Alumno ("Carmen Cano", "Reyes Católicos, 2", 16, 5, CIngles, inglesB1);
		Alumno estebanEscalera = new Alumno ("Esteban Escalera", "Isabel la Católica, 28", 25, 9, CFrances, francesB1);
		Alumno franciscoFarfan = new Alumno ("Francisco Farfán", "Cristóbal Colón, s/n", 31, 8.5f, CFrances, francesA2);
		Alumno eduardoQuiroga = new Alumno ("Eduardo Quiroga", "Calle Abedul, 25", 10, 9, CIngles, inglesB2);
		
		
		// Ejercicio 1: utilizamos los Getter de Centro para obtener sus direcciones.
		
		System.out.println("Dirección de la escuela de inglés: " + CIngles.getDireccion());
		System.out.println("Dirección de la escuela de francés: " + CFrances.getDireccion());
		
		
		// Ejercicio 2: utilizamos el Getter de alumno para obtener su nombre.
		// Luego utilizamos el Getter de Centro a través del Getter de alumno, para obtener el nombre del centro.
		
		System.out.println(String.format("La alumna %s está matriculada en el centro %s." ,
				carmenCano.getNombre(), carmenCano.getCentro().getNombre()));
		
		
		/* Ejercicio 3: utilizamos el Getter de alumno para obtener su nombre, utilizamos el Getter de asignatura, a través del Getter
		 * de Alumno para obtener el nombre de la asignatura. Por último, utilizamos el Getter de alumno para obtener la nota.
		 */
		
		System.out.println(String.format("La nota que ha sacado %s en %s es un %.1f.", 
				benitoBueno.getNombre(), benitoBueno.getAsignatura().getNombre(), benitoBueno.getNota()));
	}

}
