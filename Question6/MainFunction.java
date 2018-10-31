package Question6;

public class MainFunction {

    public static void main (String args[]){

        PiggyBank piggyBank = new PiggyBank();
        piggyBank.AddDime();
        piggyBank.AddNickel();
        piggyBank.AddPenny();
        piggyBank.AddQuarter();

        PiggySave piggySave = new PiggySave();
        piggySave.Save(piggyBank);
        PiggyLoad piggyLoad = new PiggyLoad();
        piggyLoad.Load(piggyBank);


    }

}
