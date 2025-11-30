package GeeksForGeeks;

public class CheckVowelConsonants {

    public static void vowelConsonant(char ch){
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch+" is vowel");
        }else{
            System.out.println(ch+" is consonant ");
        }
    }
    public static void main(String[] args) {
        vowelConsonant('I');

    }
}
