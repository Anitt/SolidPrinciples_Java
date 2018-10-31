package Question6;

import java.io.FileReader;
import java.util.Scanner;

public class PiggyLoad {

    public void Load(PiggyBank piggyBank)
    {
        try
        {
            Scanner in = new Scanner(new FileReader("piggybank.txt"));
            piggyBank.numPennies = Integer.parseInt(in.next());
            piggyBank.numDimes = Integer.parseInt(in.next());
            piggyBank.numNickels = Integer.parseInt(in.next());
            piggyBank.numQuarters = Integer.parseInt(in.next());
        }
        catch (Exception e)
        {
            System.out.println("I am a bad programmer that hid an exception.");
        }
    }
}
