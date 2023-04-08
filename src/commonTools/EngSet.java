package commonTools;

import java.util.ArrayList;

public class EngSet
{

    private ArrayList<Character> engChars;

    public EngSet()
    {
        engChars = new ArrayList<>();
        fill();
    }

    public ArrayList<Character> getEngChars() {return engChars;}

    private void fill()
    {
        engChars.add('q');  engChars.add('Q');
        engChars.add('w');  engChars.add('W');
        engChars.add('e');  engChars.add('E');
        engChars.add('r');  engChars.add('R');
        engChars.add('t');  engChars.add('T');
        engChars.add('y');  engChars.add('Y');
        engChars.add('u');  engChars.add('U');
        engChars.add('i');  engChars.add('I');
        engChars.add('o');  engChars.add('O');
        engChars.add('p');  engChars.add('P');
        engChars.add('a');  engChars.add('A');
        engChars.add('s');  engChars.add('S');
        engChars.add('d');  engChars.add('D');
        engChars.add('f');  engChars.add('F');
        engChars.add('g');  engChars.add('G');
        engChars.add('h');  engChars.add('H');
        engChars.add('j');  engChars.add('J');
        engChars.add('k');  engChars.add('K');
        engChars.add('l');  engChars.add('L');
        engChars.add('z');  engChars.add('Z');
        engChars.add('x');  engChars.add('X');
        engChars.add('c');  engChars.add('C');
        engChars.add('v');  engChars.add('V');
        engChars.add('b');  engChars.add('B');
        engChars.add('n');  engChars.add('N');
        engChars.add('m');  engChars.add('M');

        engChars.add('0');  engChars.add('1');
        engChars.add('2');  engChars.add('3');
        engChars.add('4');  engChars.add('5');
        engChars.add('6');  engChars.add('7');
        engChars.add('8');  engChars.add('9');

        engChars.add('\"'); engChars.add('!');  engChars.add('\''); engChars.add('^');
        engChars.add('#');  engChars.add('+');  engChars.add('$');  engChars.add('%');
        engChars.add('&');  engChars.add('/');  engChars.add('{');  engChars.add('(');
        engChars.add('[');  engChars.add(')');  engChars.add(']');  engChars.add('=');
        engChars.add('}');  engChars.add('?');  engChars.add('*');  engChars.add('-');
        engChars.add('_');  engChars.add('@');  engChars.add('€');  engChars.add(',');
        engChars.add(';');  engChars.add('.');  engChars.add(':');  engChars.add('<');
        engChars.add('>');  engChars.add('|');
    }

}
