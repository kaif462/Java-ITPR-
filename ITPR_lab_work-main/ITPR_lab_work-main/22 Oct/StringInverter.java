package DAY6;
import java.util.Scanner;
class  StringInverterOperation{
public static String InvertStrinig(String Sentence){
    String Invertedstring = "" ;
    char Checkdata;
    for(int i = 0 ; i< Sentence.length();i++){
        Checkdata = Sentence.charAt(i);
        if(Checkdata<='Z' && Checkdata>='A'){
            char lower = Character.toLowerCase(Checkdata);
            Invertedstring = Invertedstring + lower;
        }
        else if(Checkdata>='a'&& Checkdata<='z'){
            char upper = Character.toUpperCase(Checkdata);
            Invertedstring = Invertedstring + upper;
        }
        else{
            Invertedstring = Invertedstring + Checkdata;
        }

    }
    return Invertedstring;
}
}

public class StringInverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence :- ");
        String Sentence = sc.nextLine();
  String InvertedString =  StringInverterOperation.InvertStrinig(Sentence);
        System.out.println("Inverted String is "+InvertedString);
    }
}
