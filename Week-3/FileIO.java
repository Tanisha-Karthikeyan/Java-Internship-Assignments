import java.io.*;
import java.util.*;

public class FileIO
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> wordCount = new HashMap<>();

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            String line;

            while((line = reader.readLine()) != null)
            {
                String[] words = line.toLowerCase().split("\\s+");

                for(String word : words)
                {
                    word = word.replaceAll("[^a-zA-Z0-9]", "");

                    if(!word.isEmpty())
                    {
                        if(wordCount.containsKey(word))
                        {
                            wordCount.put(word, wordCount.get(word) + 1);
                        }
                        else
                        {
                            wordCount.put(word, 1);
                        }
                    }
                }
            }

            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            for(String word : wordCount.keySet())
            {
                writer.write(word + " : " + wordCount.get(word));
                writer.newLine();
            }

            writer.close();

            System.out.println("Word frequency written to output.txt");
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}