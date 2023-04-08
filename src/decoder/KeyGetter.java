package decoder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class KeyGetter
{
    private Map<Integer, Character> keys;

    protected KeyGetter(String filePath)
    {
        keys = new HashMap<>();
        fill(filePath);
    }

    protected Map<Integer, Character> getKeys(){return keys;}

    private void fill(String filePath)
    {
        File file = new File(filePath);

        try
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                int value = Integer.parseInt(line.substring(2));
                keys.put(value, line.charAt(0));
            }

        }
        catch (IOException e){e.printStackTrace();}

    }

}
