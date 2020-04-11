package controlstatements;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float population = 312032486f;
		float oneYear = 31536000f; // seconds in a year
		float birthsPerYear = oneYear/7;
		float deathsPerYear = oneYear/13;
		float immigrantsPerYear = oneYear/45;
		
		int populationYear1 = (int) (population + birthsPerYear + immigrantsPerYear - deathsPerYear);
		int populationYear2 = (int) (populationYear1 + birthsPerYear + immigrantsPerYear - deathsPerYear);
		int populationYear3 = (int) (populationYear2 + birthsPerYear + immigrantsPerYear - deathsPerYear);
		int populationYear4 = (int) (populationYear3 + birthsPerYear + immigrantsPerYear - deathsPerYear);
		int populationYear5 = (int) (populationYear4 + birthsPerYear + immigrantsPerYear - deathsPerYear);

		
		System.out.println("U.S population in Year 1: " + populationYear1);
		System.out.println("U.S population in Year 2: " + populationYear2);
		System.out.println("U.S population in Year 3: " + populationYear3);
		System.out.println("U.S population in Year 4: " + populationYear4);
		System.out.println("U.S population in Year 5: " + populationYear5);
	}

}
