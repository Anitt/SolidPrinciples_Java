package Question3;

import java.util.ArrayList;

public class EmailSender
{
	public void SendEmail(ArrayList<String> reportData,String emailAddress, String subject)

	{

		try
		{
			StringBuilder builder = new StringBuilder();

			for (int i = 0; i < reportData.size(); i++)
			{
				builder.append(reportData.get(i) + "\n");
			}

			System.out.println("To: " + emailAddress);
			System.out.println("Subject: " + subject);
			System.out.println("Message: \n\n" + builder.toString());

		}
		catch (Exception e)
		{
			System.out.println("Yipes internet must be down!");
		}

	}
}