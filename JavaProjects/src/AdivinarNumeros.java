import java.util.Random;
import java.util.Scanner;

public class AdivinarNumeros
{
    public static void main(String[] args)
    {
        final int numeroSecreto = (randInt(0, 2147483646));
        boolean done = false;
        int counter = 0;

        while(!done)
        {
            final Scanner scanner = new Scanner(System.in);
            System.out.print("Pon un numero: ");

            if(scanner.hasNextInt())
            {
                final int miNumero = scanner.nextInt();

                if(numeroSecreto == miNumero)
                {
                    done = true;
                    System.out.println("CORRECTO!");
                }
                else if(numeroSecreto > miNumero) System.out.println("Muy bajo");
                else System.out.println("Muy alto");
            }
            else
            {
                counter++;

                if(counter > 99)
                {
                    System.out.println("Te lo advertí, adios, burro.");
                    done = true;
                }
                else if(counter > 50)
                {
                    System.out.println("TE LO VOY A VOLVER A REPETIR.");
                    System.out.println("Y YA VAN " + counter + " VECES QUE TE LO DIGO.");
                    System.out.println("NECESITAS UN NUMERO MENOR A 2147483647");

                    if(100 - counter == 1)
                    {
                        System.out.println("NO SEAS NECIO, HAZME CASO, SI TE LO TENGO QUE DECIR " + (100 - counter)  + " VEZ MAS, " +
                                "VOY A TERMINAR ESTE JUEGUITO TONTO.");
                    }
                    else
                    {
                        System.out.println("NO SEAS NECIO, HAZME CASO, SI TE LO TENGO QUE DECIR " + (100 - counter)  + " VECES MAS, " +
                                "VOY A TERMINAR ESTE JUEGUITO TONTO.");
                    }
                }
                else if(counter > 20)
                {
                    System.out.println("TU NO ENTIENDES MENSOOOO!");
                    System.out.println("TE HE DICHO " + counter + " VECES QUE TIENE QUE SER UN NUMERO MENOR A 2147483647!!!!\nTONTO.");
                    System.out.println("¿QUE MAS NECESITAS?");
                }
                else if(counter > 1)
                {
                    System.out.println("YA TE DIJE " + counter + " VECES QUE TIENE QUE SER UN NUMERO MENOR A 2147483647!!!!\nTONTO.");
                }
                else System.out.println("Amigo, tienes que poner un numero menor a 2147483647. Muchas gracias.");
            }
        }
    }

    public static int randInt(int min, int max)
    {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
