package HackerRank;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CurrencyFOrmat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		double payment = 1234.56;
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

	}

}
