package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (i == cathetusLength - 1 || j == 0 || i == j) {
                    System.out.print(" 8 ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();

        }

    }

//    public static void main(String[] args) {
//        printTriangle(7);
//    }
}
