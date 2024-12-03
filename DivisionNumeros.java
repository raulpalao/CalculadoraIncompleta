import java.util.Scanner;

public class DivisionNumeros
{
    public static void main( String[] args )
    {
        int n1, n2, division;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        division = n1 / n2;

        System.out.println( "La division de " + n1 + " entre " + n2 + " es " + division + "." );
    }
}
