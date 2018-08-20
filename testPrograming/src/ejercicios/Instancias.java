package ejercicios;

class Instancias extends Object {
	
	public static void main (String[] args) {
		
		Integer bawi = 121;

		Instancias instancias = new Instancias();

		System.out.println ("Valor de la variable: " + bawi);

		System.out.println (instancias instanceof Object);

		System.out.println (bawi.getClass().toString());

	}
}