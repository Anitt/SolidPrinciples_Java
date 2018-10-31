package Question5;

import Question5.ICountry;

import java.util.ArrayList;

public class CountryGDPReport
{
	ArrayList<ICountry> countries ;

	public CountryGDPReport()
	{
		countries = new ArrayList<ICountry>();
	}

	public void addCountry(ICountry country){

		countries.add(country);

	}


	public void PrintCountryGDPReport()
	{
		System.out.println("GDP By Country:\n");
		for (int i = 0 ; i < countries.size() ; i++){

			countries.get(i).PrintCountryGDPReport();

		}



	}
}