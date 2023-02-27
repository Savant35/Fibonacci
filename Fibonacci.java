import java.util.Scanner;

public class Fibonacci{

  public static long refib(int n){
    if (n <= 1 && !(n < 0)) return n; 
    return (refib(n-1) + refib(n-2));
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("please input a number: " );
    int n = sc.nextInt();
    sc.close();
    System.out.println(refib(n));
  }
}
