package e1;


public class StringCount {
    public static int countWords(String text) {

        if(text==null){

            return 0;
        }
        if(text.length()<=0){
            return 0;
        }
        text=text.trim();
        return text.split("\\s+|\n").length;
    }
    public static int countChar (String text,char c) {
        int totalCharacters = 0;
        if(text==null){
            return 0;
        }
        if(text.length()<=0){
            return 0;
        }
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i)==c) {
                totalCharacters++;
            }
        }
        return totalCharacters;
    }
    public static int countCharIgnoringCase (String text,char c){

        int Chars = 0;
        if(text==null){
            return 0;
        }
        if(text.length()<=0){
            return 0;
        }
        if(Character.isUpperCase(c)){
            c=Character.toLowerCase(c);
        }
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))&&text.charAt(i)==c ) {
                Chars++;
            }
        }
        for (int i = 0; i < text.length(); i++) {

            if (Character.isUpperCase(text.charAt(i))&&text.charAt(i)==Character.toUpperCase(c)) {
                Chars++;
            }
        }
        return Chars;
    }


    public static boolean isPasswordSafe(String password) {
        int mayusculas = 0, minusculas = 0, digitos = 0, especial = 0;
        String CEspecial = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        if(password==null){
            return false;
        }
        if(password.length()<=0){
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                mayusculas++;
            } else if (Character.isLowerCase(password.charAt(i))) {
                minusculas++;
            } else if (Character.isDigit(password.charAt(i))) {
                digitos++;
            } else if (CEspecial.contains(Character.toString(password.charAt(i)))) {
                especial++;

            }
        }
        return password.length() >= 8 && mayusculas >= 1 && minusculas >= 1 && digitos >= 1 && especial >= 1;
    }



}

