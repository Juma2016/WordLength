package at.fhj.msd;

public class IsValidWord {

    public static boolean checkWord(String word){
        if(word==null||word.isBlank())
            throw new IllegalArgumentException();

        return word.length()>= 5 && word.length() <=12;
    }
    public static int lengthOfWord(String word){
        return word.length();
    }
}