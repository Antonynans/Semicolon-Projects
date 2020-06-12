//
(Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
simplicity, use the following algorithm:
To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
with String method split. To translate each English word into a pig Latin word, place the first
letter of the English word at the end of the word and add the letters “ay.” Thus, the word “jump”
becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputercay.” Blanks between words remain as blanks. Assume the following: The English phrase consists of
words separated by blanks, there are no punctuation marks and all words have two or more letters.
Method printLatinWord should display each word. Each token is passed to method printLatinWord to print the pig Latin word. Enable the user to input the sentence. Keep a running display of
all the converted sentences in a text area.
//


import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String sentence = input.nextLine();
       SecureRandom random = new SecureRandom();
       String[] tokens = sentence.split(" ");
       

    for(String token : tokens){
        String newtoken = removeString(token, 0) + token.charAt(0) + "ay";
        System.out.println(newtoken);
    }

    }
    public static String removeString(String s, int p) {
        return s.substring(0,p) + s.substring(p + 1);
    }
}
