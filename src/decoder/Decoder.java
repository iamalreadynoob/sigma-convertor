package decoder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Decoder
{
    private ArrayList<String> lines;
    String fileName;
    public Decoder() {lines = new ArrayList<>();}

    public void convert(String fileName)
    {
        this.fileName = fileName;
        lines = new FileRemaker(fileName + ".sigma", new KeyGetter(fileName + ".male").getKeys()).getLines();
    }

    public ArrayList<String> getList()
    {
        ArrayList<String> temp = new ArrayList<>();

        for (String line: lines) {temp.add(line);}

        lines.clear();

        return temp;
    }


    public void getTxt()
    {
        File file = new File(fileName + ".txt");

        try
        {
            FileWriter writer = new FileWriter(file);
            for (String line: lines) writer.write(line + "\n");

            writer.close();
        }
        catch (IOException e){e.printStackTrace();}

        lines.clear();
    }

    public String getString()
    {
        String text = null;

        for (String line: lines)
        {
            if (text == null) text = line;
            else text += "\n" + line;
        }

        return text;
    }

}
