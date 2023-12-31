/* Calculator class to converted user input */

package question1;

public class Calculator {

	//method
	
	public double convertFahrenheitToCelsius(double aFahrenheit) {
	//convert user input fahrenheit to celcius
		double celcius;
		celcius = (5D/9D)*(aFahrenheit-32D);
		return celcius;
	}
	
	public double convertKilogramToPound(double aKilogram) {
	//convert user input kilogram to pound
		double pound;
		pound = (double)aKilogram / 0.454;
		return pound;
	}
	
	public double convertPoundToKilogram(double aPound) {
	//convert user input pound to kilogram
		double kilogram;
		kilogram = (double)aPound * 0.454;
		return kilogram;
	}
}
