package day5;

public class breakandcontinue {

	public static void main(String[] args) {
		for (int j = 1; j <=10; j++) {
			if (j == 5) {
				System.out.println("hmm BX 5 is here, skip past this boy,");
				continue;
			}
			
			if (j ==8) {
				System.out.println("Damnn we cant go past BX 8, break, break.");
				break;
			}
			System.out.println("BX-0T "+j);
		}

	}

}
