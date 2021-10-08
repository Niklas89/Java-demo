public class CharArrayToStringExample  
{  
public static void main(String args[])  
{  
//character array  
char[] ch = {'w', 'e', 'l', 'c', 'o', 'm', 'e', ' ' , 't', 'o', ' ', 'J', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};  
//constructor of the String class that parses char array as a parameter  
String string = new String(ch);  
//prints the string  
System.out.println(string);  
}  
}  