package es.studium.EDPractica1;

public class TestAcademiaDeIdiomas {

	/* Este es el m�todo main. Desde este m�todo se empieza a ejecutar un programa Java. En este m�todo crearemos instancias de las clases
	 * creadas previamente y llevaremos a cabo los ejercicios.
	 */
	public static void main(String[] args) {
		
		/* Creamos primero los centros y las asignaturas utilizando los constructores por par�metros. Hay que pasarle los par�metros seg�n el orden
		 * definido en la clase.
		 */
		Centro CIngles = new Centro ("Escuela de Ingl�s", "Reyes Cat�licos, 14", "4576A");
		Centro CFrances = new Centro ("Escuela de franc�s", "Crist�bal Col�n, 92", "8674H");
		
		Asignatura inglesB1 = new Asignatura ("Ingl�s B1", 5, "435S");
		Asignatura inglesB2 = new Asignatura ("Ingl�s B2", 7, "234S");
		Asignatura francesA2= new Asignatura ("Franc�s A2", 3, "437F");
		Asignatura francesB1 = new Asignatura ("Franc�s B1", 3, "231F");
		
		/* Creamos los alumnos utilizando el constructor por par�metros. Hab�a que instanciar previamente los Centros y Asignaturas para
		 * poder pasarle estos objetos a los alumnos.
		 */
		Alumno anaAbel = new Alumno ("Ana Abel", "Paseo de Am�rica, 15", 35, 7, CIngles, inglesB1);
		Alumno benitoBueno = new Alumno ("Benito Bueno", "Reyes Cat�licos, 16", 12, 6, CIngles, inglesB2);
		Alumno carmenCano = new Alumno ("Carmen Cano", "Reyes Cat�licos, 2", 16, 5, CIngles, inglesB1);
		Alumno estebanEscalera = new Alumno ("Esteban Escalera", "Isabel la Cat�lica, 28", 25, 9, CFrances, francesB1);
		Alumno franciscoFarfan = new Alumno ("Francisco Farf�n", "Crist�bal Col�n, s/n", 31, 8.5f, CFrances, francesA2);
		Alumno eduardoQuiroga = new Alumno ("Eduardo Quiroga", "Calle Abedul, 25", 10, 9, CIngles, inglesB2);
		
		
		// Ejercicio 1: utilizamos los Getter de Centro para obtener sus direcciones.
		
		System.out.println("Direcci�n de la escuela de ingl�s: " + CIngles.getDireccion());
		System.out.println("Direcci�n de la escuela de franc�s: " + CFrances.getDireccion());
		
		
		// Ejercicio 2: utilizamos el Getter de alumno para obtener su nombre.
		// Luego utilizamos el Getter de Centro a trav�s del Getter de alumno, para obtener el nombre del centro.
		
		System.out.println(String.format("La alumna %s est� matriculada en el centro %s." ,
				carmenCano.getNombre(), carmenCano.getCentro().getNombre()));
		
		
		/* Ejercicio 3: utilizamos el Getter de alumno para obtener su nombre, utilizamos el Getter de asignatura, a trav�s del Getter
		 * de Alumno para obtener el nombre de la asignatura. Por �ltimo, utilizamos el Getter de alumno para obtener la nota.
		 */
		
		System.out.println(String.format("La nota que ha sacado %s en %s es un %.1f.", 
				benitoBueno.getNombre(), benitoBueno.getAsignatura().getNombre(), benitoBueno.getNota()));
	}

}
