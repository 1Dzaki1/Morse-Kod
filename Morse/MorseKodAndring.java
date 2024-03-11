package Morse;

import java.util.HashMap;

public class MorseKodAndring {

    private static final HashMap<Character, String> engelskaTillMorse = new HashMap<>();
    private static final HashMap<String, Character> morseTillEngelska = new HashMap<>();

    static {
        engelskaTillMorse.put('A', "*-");
        engelskaTillMorse.put('B', "-***");
        engelskaTillMorse.put('C', "-*-*");
        engelskaTillMorse.put('D', "-**");
        engelskaTillMorse.put('E', "*");
        engelskaTillMorse.put('F', "**-*");
        engelskaTillMorse.put('G', "--*");
        engelskaTillMorse.put('H', "****");
        engelskaTillMorse.put('I', "**");
        engelskaTillMorse.put('J', "*---");
        engelskaTillMorse.put('K', "-*-");
        engelskaTillMorse.put('L', "*-**");
        engelskaTillMorse.put('M', "--");
        engelskaTillMorse.put('N', "-*");
        engelskaTillMorse.put('O', "---");
        engelskaTillMorse.put('P', "*--*");
        engelskaTillMorse.put('Q', "--*-");
        engelskaTillMorse.put('R', "*-*");
        engelskaTillMorse.put('S', "***");
        engelskaTillMorse.put('T', "-");
        engelskaTillMorse.put('U', "**-");
        engelskaTillMorse.put('V', "***-");
        engelskaTillMorse.put('W', "*--");
        engelskaTillMorse.put('X', "-**-");
        engelskaTillMorse.put('Y', "-*--");
        engelskaTillMorse.put('Z', "--**");
        engelskaTillMorse.put('0', "-----");
        engelskaTillMorse.put('1', "*----");
        engelskaTillMorse.put('2', "**---");
        engelskaTillMorse.put('3', "***--");
        engelskaTillMorse.put('4', "****-");
        engelskaTillMorse.put('5', "*****");
        engelskaTillMorse.put('6', "-****");
        engelskaTillMorse.put('7', "--***");
        engelskaTillMorse.put('8', "---**");
        engelskaTillMorse.put('9', "----*");
        engelskaTillMorse.put('.', "*-*-*-");
        engelskaTillMorse.put(',', "--**--");
        engelskaTillMorse.put('?', "**--**");

        for (char key : engelskaTillMorse.keySet()) {
            morseTillEngelska.put(engelskaTillMorse.get(key), key);
        }
    }

    public static String engelskaTillMorse(String engelskText) {
        StringBuilder morse = new StringBuilder();
        for (char c : engelskText.toUpperCase().toCharArray()) {
            if (engelskaTillMorse.containsKey(c)) {
                morse.append(engelskaTillMorse.get(c)).append(" ");
            } else if (c == ' ') {
                morse.append(" ");
            } else {
                System.err.println("Ignorerar karaktär: " + c);
            }
        }
        return morse.toString().trim();
    }

    public static String morseTillEngelska(String morseKod) {
        StringBuilder engelska = new StringBuilder();
        String[] ord = morseKod.split("   ");
        for (String ettOrd : ord) {
            String[] bokstaver = ettOrd.split(" ");
            for (String enBokstav : bokstaver) {
                if (morseTillEngelska.containsKey(enBokstav)) {
                    engelska.append(morseTillEngelska.get(enBokstav));
                } else {
                    System.err.println("Ignorerar Morse Kod: " + enBokstav);
                }
            }
            engelska.append(" ");
        }
        return engelska.toString().trim();
    }
}
