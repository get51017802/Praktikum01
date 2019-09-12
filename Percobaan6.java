import java.util.Scanner;
public class Percobaan6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nilai1, nilai2, hasil;
		
		System.out.print("Masukan integer pertama : ");
		nilai1 = input.nextInt();
		System.out.println("Masukan integer kedua : ");
		nilai2 = input.nextInt();
		
		hasil = nilai1 + nilai2;
		System.out.println("hasil " +nilai1+ " + " +nilai2+ " = " +hasil);
		
	}
}