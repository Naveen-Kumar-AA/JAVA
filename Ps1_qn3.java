import java.util.*;
public class PS1_3{
       public static void main(String[] args){
           Scanner s = new Scanner(System.in);
           System.out.print("Enter the card notation : ");
           String notation = s.nextLine();
            if(notation.charAt(1)== 'S'){
              if(notation.charAt(0)=='K')
                  System.out.println("King of Spades");
              else if(notation.charAt(0)=='Q')
                  System.out.println("Queen of Spades");
              else if(notation.charAt(0)=='J')
                  System.out.println("Jack of Spades");
              else if(notation.charAt(0)=='A')
                  System.out.println("Ace of Spades");
              else if((notation.charAt(0))>='2' && (notation.charAt(0))<='9')
                  System.out.println("Card values of Spades");
             }
            else if(notation.charAt(1)== 'H'){
              if(notation.charAt(0)=='K')
                  System.out.println("King of Hearts");
              else if(notation.charAt(0)=='Q')
                  System.out.println("Queen of Hearts");
              else if(notation.charAt(0)=='J')
                  System.out.println("Jack of Hearts");
              else if(notation.charAt(0)=='A')
                  System.out.println("Ace of Hearts");
              else if((notation.charAt(0))>='2' && (notation.charAt(0))<='9')
                  System.out.println("Card values of Hearts");
             }
            else if(notation.charAt(1)== 'C'){
              if(notation.charAt(0)=='K')
                  System.out.println("King of Clubs");
              else if(notation.charAt(0)=='Q')
                  System.out.println("Queen of Clubs");
              else if(notation.charAt(0)=='J')
                  System.out.println("Jack of Clubs");
              else if(notation.charAt(0)=='A')
                  System.out.println("Ace of Clubs");
              else if((notation.charAt(0))>='2' && (notation.charAt(0))<='9')
                  System.out.println("Card values of Clubs");
             }
            else if(notation.charAt(1)== 'D'){
              if(notation.charAt(0)=='K')
                  System.out.println("King of Diamonds");
              else if(notation.charAt(0)=='Q')
                  System.out.println("Queen of Diamonds");
              else if(notation.charAt(0)=='J')
                  System.out.println("Jack of Diamonds");
              else if(notation.charAt(0)=='A')
                  System.out.println("Ace of Diamonds");
              else if((notation.charAt(0))>='2' && (notation.charAt(0))<='9')
                  System.out.println("Card values of Diamonds");
             }
        }
}