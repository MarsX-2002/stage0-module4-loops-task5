package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i== (sideLength-1) / 2 || j == sideLength / 2) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//
//    public static void main(String[] args) {
//        printCross(4);
//    }
}
