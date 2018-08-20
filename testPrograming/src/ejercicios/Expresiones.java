package ejercicios;

class Expresiones {
	
	public static void main (String[] args) {
		int octal = 0;
		int decimal = 53;

		System.out.println ((octal = decimal) + "-" + (((decimal = octal) + 3) - 1 ));

	}
}