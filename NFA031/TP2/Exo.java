public class Exo {
    public static void main (String [] arguments) {
         int a,b,c;
         boolean abc_tries;
         Terminal.ecrireString("a ? ");
         a = Terminal.lireInt();
         Terminal.ecrireString("b ? ");
         b = Terminal.lireInt();
         Terminal.ecrireString("c ? ");
         c = Terminal.lireInt();
         abc_tries = (a <= b) && (b <= c);
         Terminal.ecrireBooleanln(abc_tries);
         Terminal.ecrireStringln("\n");
    }
}