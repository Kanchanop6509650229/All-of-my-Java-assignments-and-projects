package cs300ExamCard;
import java.util.*;

public class Card {
	
	public static int cal(long[] input) {
		  int counter = 0 , resultLast = 0 , resultBeforeLast = 0 , allResult = 0;
		  for(int i = input.length-1 ; i >= 0 ; i--) {
		   if(counter % 2 == 0) {
		    resultLast += input[i];
		    counter++;
		   } else {
		    if(input[i]*2 >= 10) {
		     resultBeforeLast += (input[i]*2)%10;
		     resultBeforeLast += (input[i]*2)/10;
		    } else {
		     resultBeforeLast += (input[i]*2);
		    }
		    counter++;
		   }
		  }
		  allResult = resultLast + resultBeforeLast;
		  return allResult;
		 }
		 
		 public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  String input = scanner.next();
		  String cardType = "";
		  int result;
		  long cardNum[] = new long[input.length()];
		  for(int i = 0 ; i < cardNum.length ; i++) {
		   cardNum[i] = input.charAt(i) - '0';
		  }
		  result = cal(cardNum) % 10;
		  if(result == 0) {
		   if(cardNum[0] == 3 && (cardNum[1] == 7 || cardNum[1] == 4)) {
		    cardType = "AMEX";
		   } else if(cardNum[0] == 2 || (cardNum[0] == 5 && (cardNum[1] == 1 || cardNum[1] == 2 || cardNum[1] == 3 || cardNum[1] == 4 || cardNum[1] == 5))) {
		    cardType = "MASTERCARD";
		   } else if(cardNum[0] == 4) {
		    cardType = "VISA";
		   } else if(cardNum[0] == 6) {
		    cardType = "DISCOVER";
		   } else {
		    cardType = "OTHER";
		   }
		  } else {
		   cardType = "INVALID";
		  }
		  System.out.println(result);
		  System.out.println(cardType);
		 }

		
}
