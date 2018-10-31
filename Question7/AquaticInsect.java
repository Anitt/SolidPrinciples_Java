package Question7;

import java.time.chrono.IsoChronology;

public class AquaticInsect implements IInsect ,ISwim
{
	public void Swim()
	{
		System.out.println("Sploosh!");
	}

	public void MoveAntennae()
	{
		System.out.println("Moving my antennae underwater!");
	}
}