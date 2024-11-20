package traslations.ascii.clase;

import java.util.HashMap;
import java.util.Scanner;

public class AsciiMorse {
    HashMap<String, String> ascii;
    public  AsciiMorse() {
        ascii = new HashMap<>();
        ascii.put("a", ".-");
        ascii.put("b", "-...");
        ascii.put("c", "-.-.");
        ascii.put("d", "-..");
        ascii.put("e", ".");
        ascii.put("f", "..-.");
        ascii.put("g", "--.");
        ascii.put("h", "....");
        ascii.put("i", "..");
        ascii.put("j", ".---");
        ascii.put("k", "-.-");
        ascii.put("l", ".-..");
        ascii.put("m", "--");
        ascii.put("n", "-.");
        ascii.put("o", "---");
        ascii.put("p", ".--.");
        ascii.put("q", "--.-");
        ascii.put("r", ".-.");
        ascii.put("s", "...");
        ascii.put("t", "-");
        ascii.put("u", "..-");
        ascii.put("v", "...-");
        ascii.put("w", ".--");
        ascii.put("x", "-..-");
        ascii.put("y", "-.--");
        ascii.put("z", "--..");
        ascii.put("0", "-----");
        ascii.put("1", ".----");
        ascii.put("2", "..---");
        ascii.put("3", "...--");
        ascii.put("4", "....-");
        ascii.put("5", ".....");
        ascii.put("6", "-....");
        ascii.put("7", "--...");
        ascii.put("8", "---..");
        ascii.put("9", "----.");
    }
    public String traducir(String input) {
        StringBuilder sb = new StringBuilder();
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' '){
                sb.append(" ");
            }else {
                String morse = ascii.get(String.valueOf(c));
                if (morse != null) {
                    sb.append(morse);
                }else {
                    sb.append("no hay traduccion");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AsciiMorse asciiMorse = new AsciiMorse();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa la frase o palabra");
        String palabra = sc.nextLine();
        String morse = asciiMorse.traducir(palabra);
        System.out.println("El codigo Morse es: " + morse);


    }
}
