public class MyChar {

    private char ch;
    public MyChar(char ch){
        this.ch = ch;
    }

    public static void printUpperCaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch);
        }
    }

    public static void printLowerCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch);
        }
    }

    public boolean isDigit() {
        if(ch >= 48 && ch <=57) //between '0' and '9'
            return true;
        return false;
    }

    public boolean isAlphabet() {
        if(ch >= 97 && ch <=122)// between 'a' and 'z'
            return true;

        if(ch >= 65 && ch <=90)// between 'A' and 'Z'
            return true;
        return false;
    }

    public boolean isVowel() {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }

    public boolean isConsonant() {
        if(isAlphabet() && !isVowel())
            return true;
        return false;
    }
}
