package service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import model.User;

// Type your code

public class AstroCalculator{
	
	public String findSign(User user) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate Date = LocalDate.parse(user.getDob(), formatter);
         int date = Date.getDayOfMonth();
         int month = Date.getMonthValue();
         int year =Date.getYear();
         String result="";
         
        
         System.out.println("date:"+date);
         System.out.println("month:"+month);
         
		if((date>21 && month == 12) ||  (date<=19 && month == 1)){
			result="Capricon";
		}
		else if((date>20 && month ==1) ||  (date<=18 && month == 2)){
			result="Aquarius";
		}
		else if((date>19 && month == 2) || (date <=20 && month == 3)){
			result="Pisces";
	       }
		else if ((date>21 && month == 3) || (date <=20 && month == 4)){
	    	   result="Aries";
	       }
		else if ((date>21 && month == 4) || (date <=20 && month == 5)){
	    	   result="Taurus";
	       }
		else if ((date>21 && month == 5) || (date<=20 && month == 6)){
	    	   result="Gemini";
	       }
		else if ((date>21 && month == 6) || (date<=20 && month == 7)){
	    	   result="Cancer";
	       }
		else if ((date>21 && month  == 7) || (date<=20 && month== 8)){
	    	   result="Leo";
	       }
		else if ((date>21 && month ==8) || (date<=22 && month == 9)){
	    	   result="Virgo";
	       }
		else if ((date>23 && month == 9) || (date<=20 && month ==10)){
	    	   result="Libra";
	       }
		else if ((date>21 && month == 10) || (date<=22 && month == 11)){
	    	   result="Scorpio";
	       }
		else if ((date>23 && month == 11) || (date<=20 && month == 12)){
	    	   result="Sagitarius";
	       }
	       else
	    	   result="please enter all the values";
			
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(year,date,month);
		Period p =Period.between(birthday,today);
		
		
		
	       System.out.println("Your details");
	   		System.out.println("Name: "+user.getName());
	   		System.out.println("Age: "+p.getYears());
	   		System.out.println("Your Astrology: "+result);
	     
       return result;
	}
	 
	   
	   	
		
}