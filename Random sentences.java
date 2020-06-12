//
(Random Sentences) Write an application that uses random-number generation to create
sentences. Use four arrays of strings called article, noun, verb and preposition. Create a sentence
by selecting a word at random from each array in the following order: article, noun, verb, preposition, article and noun. As each word is picked, concatenate it to the previous words in the sentence.
The words should be separated by spaces. When the final sentence is output, it should start with a
capital letter and end with a period. The application should generate and display 20 sentences.
The article array should contain the articles "the", "a", "one", "some" and "any"; the noun
array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should contain the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should
contain the prepositions "to", "from", "over", "under" and "on".
//


import java.security.SecureRandom;
public class P1{       
        private static String[] article = {"the", "a", "one", "some","any"};
        private static String[] noun = {"boy", "girl", " dog", "town", "car"};
        private static String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        private static String[] preposition = {"to", "from", "over", "under", "on"};
    public static void main(String[] args) {

        for(int i = 0; i <= 19; i++){
            System.out.println(makeSentence());
        }
    }
    public static String makeSentence() {
        SecureRandom random = new SecureRandom();
        String articles = article[random.nextInt(article.length)];
        articles = articles.substring(0, 1).toUpperCase() + articles.substring(1);
        String nouns = noun[random.nextInt(noun.length)];
        String verbs = verb[random.nextInt(verb.length)];
        String prepositions = preposition[random.nextInt(preposition.length)];
        String articles1 = article[random.nextInt(article.length)];
        String nouns1 = noun[random.nextInt(noun.length)];
        
        String sent = articles + " " + nouns + " " + verbs + " " + prepositions + " " + articles1 + " " + nouns1 + ".";         
        return sent;         
    }
}
