import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double media = ((3.5 * A) + (7.5 * B))/11; 

        System.out.printf ("MEDIA = %.5f", media);
        System.out.println();
    }
}