using System;

class Normalnumberchecks {
    static void Main() {
        Console.Write("Enter value: ");
        int a = Convert.ToInt32(Console.ReadLine());

        if (a > 0)
            Console.WriteLine("Number is Positive");
        else if (a < 0)
            Console.WriteLine("Number is Negative");
        else
            Console.WriteLine("Number is Equal");
    }
}

