package fi.markus.testi;

import java.util.Scanner;

import net.webservicex.Country;
import net.webservicex.CountrySoap;
import net.webservicex.GetCountries;

public class CountryDetails {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna maa: ");
		String maa = lukija.nextLine();
		
//		if(args.length != 1) {
//			System.out.println("Anna edes yksi arvo :(");
//		} 
		//else {
			//String maa = args[0];
			Country country = new Country();
			CountrySoap countrySoap = country.getCountrySoap();
			String getCountries = countrySoap.getGMTbyCountry(maa);
			System.out.println(getCountries);
		//}

	}

}
