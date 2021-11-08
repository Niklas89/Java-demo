import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.concurrent.*;
// Code ecrit par Francois Barthelemy
// avec utilisation de fragments de code de RJHM van den Bergh et de 
// Paul-Benoit Larochelle 

public class MOOC{   

    static class MConsole extends WindowAdapter implements WindowListener, 
						    ActionListener, Runnable
    {
	private JFrame frame;
	private JTextArea textArea;
	private JTextField tfIn;
	private Thread reader;
	private Thread reader2;
	private boolean quit;
	private final PipedInputStream pin=new PipedInputStream(); 
	private final PipedInputStream pin2=new PipedInputStream(); 
	private final PipedInputStream inPipe = new PipedInputStream(); 
	private PrintWriter inWriter;




	public MConsole()
	{
	    // create all components and add them
	    frame=new JFrame("Java Console");
	    Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
	    Dimension frameSize=new Dimension((int)(screenSize.width/2),(int)(screenSize.height/2));
	    int x=(int)(frameSize.width/2);
	    int y=(int)(frameSize.height/2);
	    frame.setBounds(x,y,frameSize.width,frameSize.height);
	
	    textArea=new JTextArea();
	    textArea.setEditable(false);
	    //textField = new JTextField();
	
	

	    JScrollPane jsp = new JScrollPane(textArea);
	    Font font = new Font("monospaced", Font.PLAIN, 16);
	    textArea.setFont(font);
	    frame.getContentPane().setLayout(new BorderLayout());
	    frame.getContentPane().add(new JScrollPane(textArea),
				       BorderLayout.CENTER);
	    tfIn = new JTextField();
	    tfIn.setFont(font);
	    tfIn.addActionListener(this);
	    frame.getContentPane().add(tfIn,BorderLayout.SOUTH);

	    frame.setVisible(true);		
	    DefaultCaret caret = (DefaultCaret)textArea.getCaret();
	    caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);		
	    frame.addWindowListener(this);		

	    System.setIn(inPipe); 
	    try {
		inWriter = new PrintWriter(new PipedOutputStream(inPipe), true); 
	    }
	    catch(IOException e) {
		System.out.println("Error: " + e);
		return;
	    }
	    try
		{
		    PipedOutputStream pout=new PipedOutputStream(this.pin);
		    System.setOut(new PrintStream(pout,true)); 
		} 
	    catch (java.io.IOException io)
		{
		    this.append("Couldn't redirect STDOUT to this console\n"+io.getMessage());
		}
	    catch (SecurityException se)
		{
		    this.append("Couldn't redirect STDOUT to this console\n"+se.getMessage());
		} 
		
	    try 
		{
		    PipedOutputStream pout2=new PipedOutputStream(this.pin2);
		    System.setErr(new PrintStream(pout2,true));
		} 
	    catch (java.io.IOException io)
		{
		    this.append("Couldn't redirect STDERR to this console\n"+io.getMessage());
		}
	    catch (SecurityException se)
		{
		    this.append("Couldn't redirect STDERR to this console\n"+se.getMessage());
		} 		
			
	    quit=false; // signals the Threads that they should exit
				
	    // Starting two seperate threads to read from the PipedInputStreams				
	    //
	    reader=new Thread(this);
	    reader.setDaemon(true);	
	    reader.start();	
	    //
	    reader2=new Thread(this);	
	    reader2.setDaemon(true);	
	    reader2.start();
				
	}
	
	public synchronized void windowClosed(WindowEvent evt)
	{
	    quit=true;
	    this.notifyAll(); // stop all threads
	    try { reader.join(1000);pin.close();   } catch (Exception e){}		
	    try { reader2.join(1000);pin2.close(); } catch (Exception e){}
	    System.exit(0);
	}		
		
	public synchronized void windowClosing(WindowEvent evt)
	{
	    frame.setVisible(false); // default behaviour of JFrame	
	    frame.dispose();
	}
	
	public synchronized void actionPerformed(ActionEvent evt)
	{
	    String text = tfIn.getText();
	    tfIn.setText("");
	    inWriter.println(text); 
	    System.out.println(text);
	    //textArea.setText("");
	}

	public synchronized void run()
	{
	    try
		{			
		    while (Thread.currentThread()==reader)
			{
			    try { this.wait(100);}catch(InterruptedException ie) {}
			    if (pin.available()!=0)
				{
				    String input=this.readLine(pin);
				    this.append(input);
				}
			    if (quit) return;
			}
		
		    while (Thread.currentThread()==reader2)
			{
			    try { this.wait(100);}catch(InterruptedException ie) {}
			    if (pin2.available()!=0)
				{
				    String input=this.readLine(pin2);
				    this.append(input);
				}
			    if (quit) return;
			}			
		} catch (Exception e)
		{
		    this.append("\nConsole reports an Internal error.");
		    this.append("The error is: "+e);			
		}
		
	}

	private void append(String txt){
	    textArea.append(txt);
	}
	
	public synchronized String readLine(PipedInputStream in) throws IOException
	{
	    String input="";
	    do
		{
		    int available=in.available();
		    if (available==0) break;
		    byte b[]=new byte[available];
		    in.read(b);
		    input=input+new String(b,0,b.length);														
		}while( !input.endsWith("\n") &&  !input.endsWith("\r\n") && 
			!quit);
	    return input;
	}	
		
    }

 
    private static java.util.Scanner scan;
    private static String[] listeMots =
    {"MATERIAU      ", "POLITIQUE     ", "FAVORISER     ", "EXTERIEUR     ", 
     "FINANCER      ", "TRADITION     ", "CONSULTER     ", "POSSIBILITE   ", 
     "POURCENTAGE   ", "FAVORABLE     ", "ORDINATEUR    ", "FONCTIONNER   ", 
     "EXPANSION     ", "LOGICIEL      ", "CONTINUE      ", "LIQUIDATION   ", 
     "BOURSIER      ", "RACHETER      ", "ALIMENTAIRE   ", 
     "ALLEMANDE     ", "INVESTISSEUR  ", "OBLIGATOIRE   ", 
     "UTILISATION   ", "IMMEUBLE      ", "NECESSAIRE    ", 
     "AUGMENTER     ", "BENEFICIER    ", "TRAVAILLER    ", "DIRECTIVE     ", 
     "GENERALE      ", "CONSOLIDATION ", "CORRECTION    ", 
     "INTERVENTION  ", "COMPETITIVITE ", "FONCTION      ", 
     "MINISTRE      ", "PERMANENTE    ", "NUMERIQUE     ", "CROISSANCE    ", 
     "CONSTRUCTEUR  ", "MANAGEMENT    ", "EVIDEMMENT    ", "INSTITUTION   ", 
     "MOUVEMENT     ", "PUREMENT      ", "NATIONAL      ", "INITIATIVE    ", 
     "ENORMEMENT    ", "RETROUVER     ", "INVESTISSEUR  ", "ACCUEILLIR    ", 
     "PERSPECTIVE   ", "STRATEGIQUE   ", "COMPARAISON   ", "PREFERENCE    ", 
     "PRODUCTEUR    ", "CHIMIQUE      ", "RISQUER       ", 
     "TENDANCE      ", "SPECIALISTE   ", "ATTENTION     ", 
     "SPECIALISEE   ", "FONCTIONNEMENT", "LARGEMENT     ", "BEAUCOUP      ", 
     "GLOBALEMENT   ", "RECUPERER     ", "VIOLENCE      ", "PREVENTION    ", 
     "CONSTATER     ", "CONDUITE      ", "CONSACRER     ", "BENEFICE      ", 
     "ASSURANCE     ", "ASSUREUR      ", "JUSTIFIE      ", "UNIVERSITE    ", 
     "FONDATION     ", "RESPECTER     ", "SPECIALISER   ", "CONCLUSION    ", 
     "NOTATION      "};
    static{
	scan=new java.util.Scanner(System.in);
	scan.useLocale(java.util.Locale.ENGLISH);
    }
    public static void useMOOCTerminal(){
	new MConsole();
	scan=new java.util.Scanner(System.in);
	scan.useLocale(java.util.Locale.ENGLISH);
    }
    public static double readDouble(){
	double res = scan.nextDouble();
	scan.nextLine();
	return res;
    }
    public static void pause(double n){
	try{
	    Thread.sleep((long)(n* 1000));
	}catch(InterruptedException ie){
	    throw new RuntimeException();
	}
    }
    public static String readString(){
	String res = scan.nextLine();
	return res;
    }
    public static int readInt(){
	int res = scan.nextInt();
	scan.nextLine();
	return res;
    }
    public static boolean readBoolean(){
	boolean res = scan.nextBoolean();
	scan.nextLine();
	return res;
    }
    public static boolean isDigit(char c){
	return Character.isDigit(c);
    }
    public static char readChar(){
	char res =  scan.nextLine().charAt(0);
   	return res;
    }
    public static int auSort(int min, int max){
	return (int) (Math.random()*(max-min+1)+min);
    }

    public static char[] motAuSort(){
	return listeMots[(int) (Math.random()*(listeMots.length))].toCharArray();
    }
}