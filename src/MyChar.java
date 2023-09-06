public class MyChar {

    private char ch;
    public MyChar(char ch){
        this.ch = ch;
    }

    /*public static void printUpperCaseAlphabets() {
    }

    public static void printLowerCaseAlphabets() {
    }

    public boolean isNumber() {
    }

    public boolean isAlphabet() {
    }*/

    public boolean isVowel() {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        return true;
        return false;
    }
}
