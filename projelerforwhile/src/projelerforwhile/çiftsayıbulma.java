package projelerforwhile;
import java.util.Scanner;

public class çiftsayıbulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ınp=new Scanner(System.in);
		System.out.println("Lütfen bir sınıf giriniz: ");
		int n1=ınp.nextInt();
		for (int i =1; i<n1; i++) {
			if (i%2!=0) {
				continue;
				
			}else {
				System.out.println(i);
			}
		}
		

	}

}
