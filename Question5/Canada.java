package Question5;

import Question5.ICountry;

public class Canada implements ICountry
{
	public String getAgriculture()
	{
		return "$50000000 CAD";
	}

	public String getManufacturing()
	{
		return "$100000 CAD";
	}

	@Override
	public void PrintCountryGDPReport() {

		System.out.println("- Canada:\n");
		System.out.println("   - Agriculture: " + getAgriculture());
		System.out.println("   - Manufacturing: " + getManufacturing());
	}
}