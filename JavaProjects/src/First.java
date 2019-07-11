import java.io.*;
import java.util.*;

class First
{
    public static void main(String[] args)
    {
        numberOfCharactersPerLine("myFile2.txt");
    }

    private static void numberOfCharactersPerLine(String fileName)
    {
        try
        {
            final FileReader reader = new FileReader(fileName);
            final Scanner file = new Scanner(reader);

            if(file.hasNext())
            {
                final List<String> listContainingFile = new ArrayList<>();
                final List<String> listToModifyFile = new ArrayList<>();
                final PrintWriter fileToModify = new PrintWriter(fileName);

                while (file.hasNextLine())
                {
                    listContainingFile.add(file.nextLine());
                }

                reader.close();

                for(String line : listContainingFile)
                {
                    int numberOfCharacters = 0;
                    final String[] arrayWithWords = line.split(" ");

                    for(String word : arrayWithWords)
                    {
                        numberOfCharacters += word.length();
                    }

                    listToModifyFile.add(line + " " + numberOfCharacters);
                }


                for(String line : listToModifyFile)
                {
                    fileToModify.println(line);
                }

                fileToModify.close();
            }
            else System.out.println("This is an empty file.");

        }
        catch (IOException exception)
        {
            System.out.println("File not found.");
        }
    }
}
