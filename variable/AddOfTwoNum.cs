using System;

class AddOfTwoNum
{
    static double AddNumbers(double a, double b)
    {
        return a + b;
    }

    static void Main()
    {
        Console.Write("Enter first number: ");
        double num1 = Convert.ToDouble(Console.ReadLine());
        Console.Write("Enter second number: ");
        double num2 = Convert.ToDouble(Console.ReadLine());
        double result = AddNumbers(num1, num2);
        Console.WriteLine("The sum is: " + result);
    }
}