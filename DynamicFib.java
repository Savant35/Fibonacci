import java.util.*;

public class DynamicFib{

  public static long refib(int n){
    int[] a = new int[n+1];
    a[0] = 0;
    a[1] = 1;
    for (int i = 2; i <= n; i++) {
      a[i] = a[i-1] + a[i-2];
    }
    return a[n];
  }

  public static void main(String[] args){
int n = 15;
System.out.println(refib(n));
  }
}
