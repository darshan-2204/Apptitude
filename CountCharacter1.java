import java.util.Scanner;
 class CountCharacter1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] charArr = str.toCharArray();
		System.out.println("Enter a character :");
		char c = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == c) {
				count++;
			}
		}
		System.out.println( c );
		System.out.println(count);
	}
}
