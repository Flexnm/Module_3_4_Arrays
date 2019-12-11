package arrayStuff;

public class Ex75 {
	public static void main(String[] args) {
		int[][] studentGrades = new int[20][10];
		int megasum = 0;
		for (int i = 0; i < studentGrades.length; i++) {
			int sum = 0;
			for (int j = 0; j < studentGrades[i].length; j++) {
				studentGrades[i][j] = (int) (Math.random() * 101);
			}
			for (int j = 0; j < studentGrades[i].length; j++) {
				sum += studentGrades[i][j];
				megasum += studentGrades[i][j];

			}
			System.out.println("Average of student " + (i + 1) + " is: " + sum / 10);
			
		}
		System.out.println(megasum/200); // This is all unfinished and bad. Dont copy.
	}

}
