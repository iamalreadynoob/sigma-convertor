package commonTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Inputter
{

    private ArrayList<String> input;
    private String filePath;
    public Inputter(String filePath)
    {
        input = new ArrayList<>();
        this.filePath = filePath;
        read();
    }

    public ArrayList<String> getInput() {return input;}

    private void read()
    {
        try
        {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) input.add(line);
        }
        catch (IOException e){e.printStackTrace();}
    }

}
