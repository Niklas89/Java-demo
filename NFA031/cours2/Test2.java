public class Test2 {
	public static void main(String[] args) {
		char a = 'x';
		int n = 2;
		Terminal.ecrireString("Valeur de 5 > 3: ");
		Terminal.ecrireBooleanln(5>3);
		Terminal.ecrireString("Valeur de a == 'b': ");
		Terminal.ecrireBooleanln(a == 'b');
		Terminal.ecrireString("Valeur de (n>=0) && (n<=100): ");
		Terminal.ecrireBooleanln((n>=0) && (n<=100));
	}
}