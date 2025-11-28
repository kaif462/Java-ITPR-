package DAY5;
import java.util.Scanner; //importing Scanner class for user input
/*---------------------------------------------------------------------*/
/*--- A class to perform character based operation on string data ---*/
class StringCharacterOperation
{
    /*---- method to count number of uppercase character ----*/
    public static int countUpperCaseCharacters(String data)
    {
        int upper = 0; //initializing number of uppercase characters
        char character; //variable to store character of given index
        for(int index = 0 ; index < data.length();index++)
        {
            //extracting character of given index
            character = data.charAt(index);
            //verifying it is uppercase character
            if(character >= 'A' && character <= 'Z')
            {
                upper++; //incrementing count for upper case character
            }
        }
        //return number of uppercase character
        return upper;
    }
    /*---- method to count number of lowercase character ----*/
    public static int countLowerCaseCharacters(String data)
    {
        int lower = 0; //initializing number of lowercase characters
        char character; //variable to store character of given index
        for(int index = 0 ; index < data.length();index++)
        {
            //extracting character of given index
            character = data.charAt(index);
            //verifying it is lowercase character
            if(character >= 'a' && character <= 'z')
            {
                lower++; //incrementing count for lower case character
            }
        }
        //return number of lowercase character
        return lower;
    }

    /*---- method to count number of alphabets in a string ----*/
    public static int countAlphabets(String data)
    {
        //number of alphabets is equal to the sum of uppercase and lowercase characters
        int alphabets = countUpperCaseCharacters(data) + countLowerCaseCharacters(data);
        //return number of alphabets
        return alphabets;
    }

    /*---- method to count total number of special characters ----*/
    public static int countSpecialCharacters(String data)
    {
        //special character is a character other than alphabet
        int special = data.length() - countAlphabets(data);
        //return number of special characters
        return special;
    }
}
/*------------------------------------------------------------------------------------*/
/*---- Initial class -----*/
public class StringOperation {

    public static void main(String[] args) {
        //Creating object of Scanner class for user input
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any sentence : ");
        String sentence = sc.nextLine(); //Reading user input

        System.out.println("-----------------------------------");
        //no. of uppercase character
        System.out.println("No. of UpperCase character : "+StringCharacterOperation.countUpperCaseCharacters(sentence));
        System.out.println("-----------------------------------");

        //no. of lowercase character
        System.out.println("No. of LowerCase character : "+StringCharacterOperation.countLowerCaseCharacters(sentence));
        System.out.println("-----------------------------------");

        //no. of alphabets character
        System.out.println("No. of Alphabets : "+StringCharacterOperation.countAlphabets(sentence));
        System.out.println("-----------------------------------");

        //no. of Special character
        System.out.println("No. of Special Character : "+StringCharacterOperation.countSpecialCharacters(sentence));
    }

}
