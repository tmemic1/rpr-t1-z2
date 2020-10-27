package ba.unsa.etf.rpr;
  import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      int n;
      Scanner unos= new Scanner(System.in);
       n=unos.nextInt();
      for(int i=1; i<=n; i++) {
          if(jeLiDjeljiv(i)) System.out.println(i);
        }
    }
    public static boolean jeLiDjeljiv(int x) {
        int x1=x;
         int suma=0;
         while(x1!=0) {
             suma=suma+x1%10;
             x1=x1/10;
         }
        if(x%suma==0) return true;
        return false;
    }
}
