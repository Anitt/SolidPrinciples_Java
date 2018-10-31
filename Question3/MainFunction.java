package Question3;

public class MainFunction {

    public static void main(String args[]){

        ProfitReport profitReport = new ProfitReport();
        profitReport.CreateReport();
        EmailSender emailSender = new EmailSender();
        emailSender.SendEmail(profitReport.reportData , "anitt.anv19@gmail.com" ,"hello");





    }
}
