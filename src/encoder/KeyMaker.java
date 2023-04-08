package encoder;

import commonTools.EngSet;
import commonTools.Seperator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class KeyMaker extends Seperator
{
    private Map<Character, Integer> keys;
    protected KeyMaker(String filePath)
    {
        keys = new HashMap<>();
        key(pathSeparator(filePath, "male"));
    }

    protected Map<Character, Integer> getKeys(){return keys;}

    private void key(String fileName)
    {
        File file = new File(fileName);

        try
        {
            FileWriter writer = new FileWriter(file);

            ArrayList<Character> charset = new EngSet().getEngChars();
            int times = charset.size();

            ArrayList<Integer> values = new ArrayList<>();
            for (int i = 0; i < times; i++) values.add(i);

            for (int i = 0; i < times; i++)
            {
                int id = new Random().nextInt(charset.size());
                int valId = new Random().nextInt(values.size());

                int value = values.get(valId);

                keys.put(charset.get(id), value);
                writer.write(Character.toString(charset.get(id)) + ":" + Integer.toString(value) + "\n");

                charset.remove(id);
                values.remove(valId);
            }

            writer.close();
        }
        catch (IOException e){e.printStackTrace();}

    }

}
