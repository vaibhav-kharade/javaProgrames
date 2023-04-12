import java.util.Scanner;
public class MethodOveroading_1 {
  
  public static void calculate() {
    System.out.println("no arg");
  }
  
  public static String calculate(int n,char ch) {
    return ch == 's' ? n % 7 == 0 ? n+"is Divisable" : n+"is not Divisable" : n % 10 ==7 ? "Last Digit"+n :"Last Digit not "+ 7; 
  }
  
  public static String calculate(int a,int b,char ch) {
    return ch=='g' ? a  >  b  ? "a is greater" : "b is greater" : a < b ? " a is samller" :" b is smaller"; 
  }
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the digit");
    int i =sc.nextInt();
    System.out.println("Enter the character");
    char ch=sc.next().charAt(0);
    
    System.out.println(calculate(i,ch));
    
    System.out.println("Enter the digits");
    int j =sc.nextInt();
    int k=sc.nextInt();
    System.out.println("Enter the charater:");
    char c=sc.next().charAt(0);
    
    
  System.out.println(calculate(j,k,c));
    sc.close();
    
  }
}