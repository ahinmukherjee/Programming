using System;

class Number {
    public void numberCalculate(int n) {
        if (n > 0)
            Console.WriteLine("Number is Positive");
        else if (n < 0)
            Console.WriteLine("Number is Negative");
        else
            Console.WriteLine("Number is Equal");
    }
}

class Numberscheck {
    static void Main() {
        Console.Write("Enter value: ");
        int a = Convert.ToInt32(Console.ReadLine());
        Number nb = new Number();
        nb.numberCalculate(a);
    }
}