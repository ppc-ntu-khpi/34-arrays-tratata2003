package domain;
/**
 * Class that have method that return true - if number is armstrong number, false - if number isn`t armstrong number 
 * @author Milka
 */
public class Exercise {
    public static boolean IsArmstrongNumber(int number)
    {
        int[] intArray = new int[15];
        int num = number;
        int sum = 0;
        
        int count = 0;
        while(number > 0)
        {
            intArray[count] = number % 10;
            number /= 10;
            count++;
        }
        
        for(int j = 0; j < count; j++)
        {
            sum += Math.pow(intArray[j], count);
        }
        
        return num == sum;
    }
}
