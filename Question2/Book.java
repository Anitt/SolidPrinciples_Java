package Question2;

import java.time.Duration;
import java.util.ArrayList;

public class Book implements ILibraryItem ,IBook
{

	public Duration GetPlayTime()
	{
		return Duration.ZERO;
	}
	public String GetAuthor()
	{
		return "Hemingway";
	}

	public String GetTitle()
	{
		return "For Whom The Bell Tolls";
	}

	public boolean IsDigitalOnly()
	{
		return false;
	}


}