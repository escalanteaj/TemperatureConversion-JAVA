/*
 * *************************************************
 *      Polytechnic University of Puerto Rico      *
 *   Electrical & Computer Engineering Department  * 
 *              Hato Rey, Puerto Rico              *
 *                                                 *
 *         CECS 3210 Advanced Programming          *
 * *************************************************
 * 
 * 
 */
package edu.pupr.temperatureconversion;

import java.util.Scanner;

/**
 * Program: <b><code>TemperatureConversion.java</code></b><br>
 * Date   : 08/22/2015<br>
 * Description:<br>
 *          Class that manages temperature conversions:<br>
 *              1) Fahrenheit to Celsius<br>
 *              2) Celsius to Fahrenheit
 * 
 * @author Armando J. Escalante escalanteaj@yahoo.com
 */
public class TemperatureConversion {

    private int celsius;
    private int fahrenheit;
    
    /**
     * Default constructor that initialize temperatures values to zero.
     */
    public TemperatureConversion() {  
        this(0,0);
    }  
    
    /**
     * Parameter constructor that receives both temperatures.
     * 
     * @param celsius
     * @param fahrenheit 
     */
    public TemperatureConversion(int celsius, int fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }
    
    /**
     * Accessor of Celsius.
     * 
     * @return celsius;
     */
    public int getCelsius() {
        return celsius;
    }
    /**
     * Mutator of Celsius.
     * 
     * @param celsius;
     */
    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }
    /**
     * Accessor of Fahrenheit.
     * 
     * @return fahrenheit;
     */
    public int getFahrenheit() {
        return fahrenheit;
    }
    /**
     * Mutator of Fahrenheit.
     * 
     * @param fahrenheit;
     */
    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    /**
     * Method to convert from Fahrenheit to Celsius.
     * 
     * @param fahrenheitTemperature
     * @return 
     */
    public int celsiusConversion(int fahrenheitTemperature)
    {
        this.celsius = ((int)((5.0/9.0)*(fahrenheitTemperature-32)));
        return this.celsius;
    }   
    /**
     * Method to convert from Celsius to Fahrenheit.
     * 
     * @param celsiusTemperature
     * @return 
     */
    public int fahrenheitConversion(int celsiusTemperature)
    {
        this.fahrenheit = ((int)((9.0/5.0)*celsiusTemperature)+32);
        return this.fahrenheit;
    }
    
    /**
     * Method to ask for temperature in Celsius degrees.
     */
    public void askCelsius(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature (in Celsius): ");
        celsius = input.nextInt();
    }
    /**
     * Method to ask for temperature in Fahrenheit degrees.
     */
    public void askFahrenheit(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature (in Fahrenheit): ");
        fahrenheit = input.nextInt();
    }
    
    /**
     * Overloading method toString.
     * @return 
     */
    @Override
	public String toString() {
            return fahrenheit + " F is equal to " + fahrenheitConversion(fahrenheit) + 
                    " C. While " + celsius + " C is equal to " + 
                    celsiusConversion(celsius) + "F.\n";
	}
    
    /**
     * Menu to interact with the user. It has three options: 
     * 1)Celsius to Fahrenheit
     * 2)Fahrenheit to Celsius
     * 3)Exit the application
     */
    public void menu(){
        int choice;
        
    do{ 
        System.out.println("Temperature Conversions");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Quit");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();  
        switch(choice){
            case 1:
                TemperatureConversion celsiusToFahrenheit = new TemperatureConversion();
                celsiusToFahrenheit.askCelsius();
                celsiusToFahrenheit.fahrenheitConversion(celsiusToFahrenheit.celsius);
                System.out.println("The Fahrenheit equivalent of " +
                        celsiusToFahrenheit.celsius + " C is: " + 
                        celsiusToFahrenheit.fahrenheit + " F.\n");
            break;
            case 2:
                TemperatureConversion fahrenhietToCelsius = new TemperatureConversion();
                fahrenhietToCelsius.askFahrenheit();
                fahrenhietToCelsius.celsiusConversion(fahrenhietToCelsius.fahrenheit);
                System.out.println("The Celsius equivalent of " +
                        fahrenhietToCelsius.fahrenheit + " F is: " + 
                        fahrenhietToCelsius.celsius + " C.\n");
            break;
            case 3:
                System.exit(0);
            break;
            default:
                System.out.println("You can choose from options 1 to 3 only.\n");    
            break;
        }
    }
    while(choice !=3);
}
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TemperatureConversion temperature = new TemperatureConversion();
        temperature.menu();  
    }
    
}
