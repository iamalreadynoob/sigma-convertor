package encoder;

import commonTools.Inputter;

import java.util.ArrayList;

public class Encoder
{
    public void encode(String filePath)
    {
        ArrayList<String> text = new Inputter(filePath).getInput();

        KeyMaker keyMaker = new KeyMaker(filePath);
        new FileMaker(filePath, text, keyMaker.getKeys());
    }

}
