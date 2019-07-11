import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Testing
{
    public static void main(String[] args)
    {
        tablaDel(10, 12);
    }

    private static void tablaDel(long numero)
    {
        for(long pos = 0; pos <= 10; pos++) System.out.println(numero + " x " + pos + " = " + (numero * pos));
    }

    private static void tablaDel(long numero, int limite)
    {
        for(long pos = 0; pos <= limite; pos++) System.out.println(numero + " x " + pos + " = " + (numero * pos));
    }
}