package traslations.ascii.clase;

import java.util.HashMap;
import java.util.Scanner;

public class MorseAscii {
    String inputText;
    HashMap<String, String> traslations = new HashMap<>();

    public MorseAscii () {

        traslations.put(".-", "a");
        traslations.put("-...", "b");
        traslations.put("-.-.", "c");
        traslations.put("-..", "d");
        traslations.put(".", "e");
        traslations.put("..-.", "f");
        traslations.put("--.", "g");
        traslations.put("....", "h");
        traslations.put("..", "i");
        traslations.put(".---", "j");
        traslations.put("-.-", "k");
        traslations.put(".-..", "l");
        traslations.put("--", "m");
        traslations.put("-.", "n");
        traslations.put("---", "o");
        traslations.put(".--.", "p");
        traslations.put("--.-", "q");
        traslations.put(".-.", "r");
        traslations.put("...", "s");
        traslations.put("-", "t");
        traslations.put("..-", "u");
        traslations.put("...-", "v");
        traslations.put(".--", "w");
        traslations.put("-..-", "x");
        traslations.put("-.--", "y");
        traslations.put("--..", "z");
        traslations.put(".----", "1");
        traslations.put("..---", "2");
        traslations.put("...--", "3");
        traslations.put("....-", "4");
        traslations.put(".....", "5");
        traslations.put("-....", "6");
        traslations.put("--...", "7");
        traslations.put("---..", "8");
        traslations.put("----.", "9");
        traslations.put("-----", "0");

    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTROUDZCA EL CÓDIGO MORSE (UN ESPACIO PARA SEPARAR LETRAS || DOS ESPACIOS PARA SEPARAR PALABRAS)");
        String text = sc.next();
        this.inputText = text;
    }

    public void morseToAscii() {
        String [] separateWords = inputText.split("//");
        for (String word : separateWords) {
            String [] chars = word.split("/");
            for (String character : chars) {
                if(traslations.get(character) != null)
                    System.out.print(traslations.get(character));
                else
                    System.err.println("SE HA INGRESADO UN CARACTER QUE NO EXISTE");
            }
            System.out.print(" ");
        }
    }
}
