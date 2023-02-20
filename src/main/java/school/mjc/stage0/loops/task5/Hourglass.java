package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        boolean isEven = height % 2 == 0;

        //First half of hourglass
        int start = 0;
        int end = height+1;

        for (int i = 1; i <= Math.round(height / 2); i++) {
            for (int j = 1; j <= height; j++) {
                if (j > start && j < end){
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            start++;
            end--;
            System.out.println("");
        }

        if (!isEven) {
            for (int i = 1; i <= height; i++) {
                if (i == Math.ceil(height / 2) + 1) System.out.print("8");
                    else System.out.print(" ");
            }
            System.out.println();
        }
        start--;
        end++;
        for (int i = 1; i <= Math.round(height / 2); i++) {
            for (int j = 1; j <= height; j++) {
                if (j > start && j < end){
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            start--;
            end++;
            System.out.println("");
        }
    }
}
