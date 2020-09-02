public class lesson002 {
    // 1
   public static void main(String[] args) {
            int[] arr = {1, 0, 0, 1, 1, 0, 0, 0, 1, 0};
            for (int a = 0; a < arr.length; a++) {
                if (arr[a] == 0) {
                    arr[a] = 1;
                } else if (arr[a] == 1) {
                    arr[a] = 0;
                }
            }
        }
    }
    // 2
    class mass2 {
        public static void main(String[] args) {
            int[] arr2 = new int[8];
            int i = 0;
            for (int b = 0; b < arr2.length; b++) {
                arr2[b] = i;
                i += 3;
                System.out.println(arr2[b]);
            }
        }
    }

    //3
    class mass3 {
        public static void main(String[] args) {
            int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int d = 0;

            for (int c = 0; c < arr3.length; c++) {
                d= arr3[c];
                if (d < 6) {
                    d *= 2;

                    System.out.println(d);
                }
            }
        }
    }
     //4
 class mass4 {
     public static void main(String[] args) {
         int[][] arr = new int[3][3];
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                 if (i == j || i == x - 1) arr[i][j] = 1;
                 System.out.print(arr[i][j] + " ");
             }
             System.out.print("\n");
         }
     }
 }
    //5
class mass5 {
    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42,-3,};
        int max = 0;
        int min = 0;
        for( int i = 0; i < arr.length; i++){
            if ( arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
    }
    //6
    public class mass6 {
        public static void main(String args[]) {

            int[] mass = new int [6];

            for (int i=0; i <6; i ++) {
                if (i == 0) {
                    mass[0] = 1; }
                if (i == 1) {
                    mass[1] = 3; }
                if (i == 2) {
                    mass[2] = 2; }
                if (i == 3) { mass[3] = 1; }
                if (i == 4)
                { mass[4] = 2; }
                if (i == 5) { mass[5] = 4; }
                int p;
                int q;
                p = mass [0] + mass[1] + mass [2];
                q = mass [3] + mass [4] + mass [5];
                switch (p-q) {
                    case 0:
                        System.out.println("true");
                        break;
                    case 1:
                        System.out.println("false");
                        break;
                    case -1:
                        System.out.println("false");
                        break;
                }
            }
        }
    }
