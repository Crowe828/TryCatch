import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			
		int[] a = null;
		System.out.println(a10]);
		} catch(NullPointerException e) {
			System.out.println("Your array is null");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("NullPointer");
		} catch (Exception e) {
			System.out.println("Something else went wrong.");
		}

	}

}
