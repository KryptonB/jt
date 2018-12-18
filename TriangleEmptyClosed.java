public class TriangleEmptyClosed {
	public static void main(String[] args) {

		int lines = 8;
		int midPoint = lines;
		int gridLength = (lines * 2) - 1;
		int numberOfStars = 1;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= midPoint; j++) {
				if (j == midPoint) {
					for (int k = 1; k <= numberOfStars; k++) {
                        if (i == lines) {
                            System.out.print('*');
                        } else {
                            if (k == 1 || k == numberOfStars) {
                                System.out.print('*');
                            } else {
                                System.out.print(' ');
                            }
                        }
                    }			
				} else {
					System.out.print(' ');
                    continue;
				}
				midPoint = midPoint - 1;
				numberOfStars = numberOfStars + 2;
			}
            System.out.println(' ');
		}

	}
}