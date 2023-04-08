package commonTools;

public abstract class Seperator
{

    public String pathSeparator(String filePath, String extension)
    {
        int loc = filePath.length() - 1;
        while (loc >= 0 && (filePath.charAt(loc) != '.')) {loc--;}
        return filePath.substring(0, loc+1) + extension;
    }

}
