public class Main {
    public static void main(String[] args) {
        System.out.println("=====Task1=====");

        int[] arrayOne = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        double[] arrayTwo = {1.57, 7.654, 9.986};

        int[] arrayThree = {1, 4, 5,};

        System.out.println("=====Task2=====");

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i]);
            if (i < arrayOne.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i]);
            if (i < arrayTwo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.print(arrayThree[i]);
            if (i < arrayThree.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("=====Task3=====");
        for (int i = arrayOne.length - 1; i >= 0; i--) {
            System.out.print(arrayOne[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            System.out.print(arrayTwo[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayThree.length - 1; i >= 0; i--) {
            System.out.print(arrayThree[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("=====Task4=====");
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 == 0) {
                System.out.print(arrayOne[i] + " ");
            } else {
                int j = arrayOne[i] + 1;
                System.out.print(j + " ");
            }


        }
    }
}



