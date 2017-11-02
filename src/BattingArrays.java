import java.util.Arrays;
import java.util.Scanner;

/***** @author pratimakaza ******/

public class BattingArrays {

	public static void main(String[] args) {

		// Prompt user for number of at bats

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Batting Average Calculator!");
		System.out.println();
		System.out.print("Enter number of times at bat: ");
		int lengthArray = scan.nextInt();
		System.out.println(lengthArray);

		// get input from user // prompt user for bases earned // enter bases earned

		double[] atBat = new double[lengthArray];
		double[] bases = new double[lengthArray];
		int sum = 0;
		int ui;
		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=homerun");
		for (ui = 0; ui < lengthArray; ui++) {
			atBat[ui] = ui;
			System.out.print("Please enter result for at bat " + ui + ":");
			bases[ui] = scan.nextInt();
		}
		System.out.println("Double atBat: " + Arrays.toString(atBat));
		System.out.println("Double bases: " + Arrays.toString(bases));

		// calculate batting avg

		int j = 0;
		for (int i = 0; i < bases.length; i++) {
			if (!(bases[i] == 0)) {
				j++;
			}
		}

		// display batting avg

		System.out.println("The number of atBats that reached atleast one Base: " + j);
		System.out.println("The Batting Average is: " + ((double) j) / ((double) atBat.length));

		// calc slugging %

		for (int i = 0; i < bases.length; i++) {
			if (!(bases[i] == 0)) {
				sum += bases[i];
			}
		}

		// display slugging %
		System.out.println("The total number of bases reached: " + sum);
		System.out.println("The Slugging Percentage is: " + ((double) sum) / ((double) atBat.length));

		scan.close();

	}
}
