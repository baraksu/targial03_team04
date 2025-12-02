public class Encryption
{
    public static void main(String[] args){
        
        System.out.println("Welcome to the Encryption / Decryption Program");
        
    }
    //Oz (methods 1)
    public static int WordsCount(String sentence){
        int len1 = sentence.length();
        String sentence1 = sentence.replace(" ","");
        int len2 = sentence1.length();
        int words = len1 - len2 + 1;
        return words;
    }
    //Oz (methods 2)
        public static String MovingRight(String sentence,int words){
        String word1 = "";
        String word2 = "";
        String word3 = "";
        if(words== 1){
            sentence = sentence;
        }
        else if(words == 2){
            word1 = sentence.substring(0,sentence.indexOf(" "));
            word2 = sentence.substring(sentence.indexOf(" ")+1);
            sentence = word2 + " " + word1;
        }
        else if(words == 3){
            word1 = sentence.substring(0,sentence.indexOf(" "));
            word2 = sentence.substring(sentence.indexOf(" ")+1 , sentence.lastIndexOf(" "));
            word3 = sentence.substring(sentence.lastIndexOf(" ")+1);
            sentence = word3 + " " + word1 + " " + word2;
        }
        return sentence;
    }
}
