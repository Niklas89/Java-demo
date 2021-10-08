public class ConversionCmPouces {
	public static void main (String[] args) {
		double centimetres;
		double pouces;
		System.out.println("Nombre de centimetres? ");
		centimetres = Terminal.lireDouble();
		pouces = centimetres *0.393701;
		System.out.println("Le nombre de pouces: ");
		System.out.println(pouces);
	}
}
