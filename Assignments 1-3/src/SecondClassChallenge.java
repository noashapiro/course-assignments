public class SecondClassChallenge {
    public static void main(String[] args) {
        //14
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        //15
        int l = 6;
        for (i = 0; i < l; i++) {
            for (j = 0; j < l; j++) {
                if (i == j || i + j == l - 1) {
                    System.out.println("# ");
                } else {
                    System.out.println("");
                }
                System.out.println();
            }

        }
    }
}
