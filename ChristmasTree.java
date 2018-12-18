public class ChristmasTree {
	public static void main(String[] args) {

		int lines = 8;
		int midPoint = lines;
        int trunkMidPoint = lines;
        int trunkHeight = 3;
		int gridLength = (lines * 2) - 1;
		int numberOfStars = 1;
        int triangles = 3;
        int triangleCounter = 1;
        
        while (triangleCounter <= triangles) {
        
            for (int i = 1; i <= lines; i++) {
                for (int j = 1; j <= midPoint; j++) {
                    if (j == midPoint) {
                        for (int k = 1; k <= numberOfStars; k++) {
                            if (k == 1 || k == numberOfStars) {
                                System.out.print('*');
                            } else {
                                if (k % 2 == 0) {
                                    System.out.print('.');
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
            
            lines = 8;
            midPoint = lines;
            numberOfStars = 1;
            triangleCounter++; 
        
        
    }
        // Tree trunk
        for (int i = 1; i <= trunkHeight; i++) {
            for (int j = 1; j <= (trunkMidPoint + 1); j++) {
                if (j == (trunkMidPoint - 1)) {
                    for (int k = 1; k <= trunkHeight; k++) {
                        System.out.print('*');
                    }
                    break;
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println(' ');
        }

	}
}