package pkg;
import java.io.*;  
import java.util.Scanner;  
public class ReadCSVExample2 
{
public static void main(String[] args) throws Exception  
     {  
//parsing a CSV file into Scanner class constructor  
Scanner sc = new Scanner(new File("C:/WorkSpaceCode/CSVDemo.csv"));  
sc.useDelimiter(","); 
while (sc.hasNext()) 
{  
	System.out.print(sc.next());     
}   
sc.close(); 
}  
}  