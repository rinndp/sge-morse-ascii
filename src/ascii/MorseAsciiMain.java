package traslations.ascii.clase;

import traslations.ascii.clase.MorseAscii;

public class MorseAsciiMain {
    public static void main(String[] args) {
        MorseAscii morseAscii = new MorseAscii();
        morseAscii.setInputText();
        morseAscii.morseToAscii();
    }
}
