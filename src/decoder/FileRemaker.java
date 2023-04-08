package decoder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class FileRemaker
{
    private ArrayList<String> lines;

    protected FileRemaker(String filePath, Map<Integer, Character> keys)
    {
        lines = new ArrayList<>();
        fill(parser(filePath), keys);
    }

    protected ArrayList<String> getLines() {return lines;}

    private ArrayList<ArrayList<String>> parser(String filePath)
    {
        ArrayList<ArrayList<String>> parsedLines = new ArrayList<>();

        File file = new File(filePath);

        try
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                ArrayList<String> pieces = new ArrayList<>();

                for (int i = 0; i < line.length(); i += 5) pieces.add(line.substring(i, i+5));

                parsedLines.add(pieces);
            }
        }
        catch (IOException e){e.printStackTrace();}

        return parsedLines;
    }

    private void fill(ArrayList<ArrayList<String>> parsedLines, Map<Integer, Character> keys)
    {
        for (int i = 0; i < parsedLines.size(); i++)
        {
            String line = null;

            int loc = 0;

            while (loc < parsedLines.get(i).size())
            {

                if (parsedLines.get(i).get(loc).equals("_CHAD"))
                {
                    if (line == null) line = " ";
                    else line += " ";
                }

                else if (parsedLines.get(i).get(loc).equals("ANDRW"))
                {
                    if (line == null) line = "?";
                    else line += "?";
                }

                else if (parsedLines.get(i).get(loc).equals("sigma"))
                {
                    int amount = 0;

                    while (loc < parsedLines.get(i).size() && !parsedLines.get(i).get(loc).equals("SIGMA"))
                    {
                        amount++;
                        loc++;
                    }

                    if (line == null) line = Character.toString(keys.get(amount));
                    else line += Character.toString(keys.get(amount));
                }

                loc++;
            }

            lines.add(line);
        }
    }
}
