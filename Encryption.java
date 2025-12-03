import java.util.*;
public class Encryption{
    //Oz (methods 1)
    public static int wordsCount(String sentence){
        int len1 = sentence.length();
        String sentence1 = sentence.replace(" ","");
        int len2 = sentence1.length();
        int words = len1 - len2 + 1;
        return words;
    }
    //Oz (methods 2)
        public static String movingRight(String sentence,int words){
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
    //המתודה של דביר נא לא לגעת 3 
        public static String movingLeft (String sentence,int words){
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
            sentence = word2 + " " + word3 + " " + word1;
        }
        return sentence;   
    }
    //move the characters to right-stern part(method 4)
    public static String moveRight(String sentence,int words){
        int len = sentence.length();
        if(words==1){
            String lastchar = sentence.substring(len-1);
            String restofchar = sentence.substring(0,len-1);
            return lastchar+restofchar;
        }else{
            if(words==2){
                String lasttwochar = sentence.substring(len-2);
                String restofchar = sentence.substring(0,len-2);
                return lasttwochar+restofchar;
            }else{
                 if(words==3){
                String lastthreechar = sentence.substring(len-3);
                String restofchar = sentence.substring(0,len-3);
                return lastthreechar+restofchar;
            }else{
                System.out.println(sentence+"contains more than 3 words");
            }
            }
        }

        return sentence;
        }
        //move the characters back to left-stern part (method 5)
    public static String moveLeft(String sentence,int words){
        if(words==1){
            String lastchar = sentence.substring(0,1);
            String restofchar=sentence.substring(1);
            sentence=restofchar + lastchar;
        }else if(words==2){
            String lasttwochar = sentence.substring(0,2);
            String restofchar=sentence.substring(2);
            sentence=restofchar + lasttwochar;
        }else if(words==3){
            String lastthreechar = sentence.substring(0,3);
            String restofchar=sentence.substring(3);
            sentence=restofchar + lastthreechar;
        }
        return sentence;
    }
      //replacing vowels to special characters-Moishie's part
    public static String replaceVowels(String sentence){
        String result = sentence.replace('a','@');
        result = sentence.replace('e','#');
        result = sentence.replace('i','1');
        result = sentence.replace('o','0');
        result = sentence.replace('u','&');
        return result;
    }
    //replacing special characters to vowels-Moishie's part
    public static String replaceSpecialCharacter(String sentence){
        String result = sentence.replace('@','a');
        result = sentence.replace('#','e');
        result = sentence.replace('1','i');
        result = sentence.replace('0','o');
        result = sentence.replace('&','u');
        return result;
    }
    //main-moishie's part
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");
        int choice=scan.nextInt();
        if(choice==1){
         System.out.println("Enter up to 3 words sentence");
         String sentence=scan.nextLine();
         int words= wordsCount(sentence);
         if(words>3){
             System.out.println(sentence+"contains more than 3 words");
         }else{
             sentence = movingRight(sentence,words);
             sentence = moveRight(sentence,words);
             sentence = replaceVowels(sentence);
             System.out.println(sentence);
             
         }
        }else if(choice==2){
            System.out.println("Enter up to 3 words sentence");
            String sentence=scan.nextLine();
            int words= wordsCount(sentence);
            sentence = replaceSpecialCharacter(sentence);
            sentence = movingLeft(sentence,words);
            sentence = moveLeft(sentence,words);
            System.out.println("The decrypted sentence:"+sentence);
        }else{
            System.out.println(choice+"is not a valid choice");
        }
    }
    }
