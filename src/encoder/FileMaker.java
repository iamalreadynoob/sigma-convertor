package encoder;

import commonTools.Seperator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class FileMaker extends Seperator
{
    private ArrayList<String> text;
    private Map<Character, Integer> keys;

    protected FileMaker(String filePath, ArrayList<String> text, Map<Character, Integer> keys)
    {
        this.text = text;
        this.keys = keys;

        make(pathSeparator(filePath, "sigma"));
    }

    private void make(String fileName)
    {
        File file = new File(fileName);

        try
        {
            FileWriter fileWriter = new FileWriter(file);

            for (int i = 0; i < text.size(); i++)
            {
                String line = null;

                for (int j = 0; j < text.get(i).length(); j++)
                {

                    if (text.get(i).charAt(j) == ' ')
                    {
                        if (line == null) line = "_CHAD";
                        else line += "_CHAD";
                    }

                    else if (keys.containsKey(text.get(i).charAt(j)))
                    {
                        for (int k = 0; k < keys.get(text.get(i).charAt(j)); k++)
                        {
                            if (line == null) line = "sigma";
                            else line += "sigma";
                        }

                        line += "SIGMA";
                    }

                    else
                    {
                        if (line == null) line = "ANDRW";
                        else line += "ANDRW";
                    }

                }

                fileWriter.write(line + "\n");
            }

            fileWriter.close();

        }
        catch (IOException e){e.printStackTrace();}
    }

}
