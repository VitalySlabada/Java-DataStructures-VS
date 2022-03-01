package SpiralArray;

public class SolveSpiral {


    public static int[] solveSpiralForloops(int[][] arr) {


        //##########Declarations################
        //dimensions: n horizontal (x axis), m vertical (y axis)
        int n = arr[0].length;
        int m = arr.length;

        //some variables to keep track of "start and finish" dimensions
        int ns = 0;
        int nf = n-1;
        int ms = 0;
        int mf = m-1;


        int[] resultArr = new int[n * m];
        int counter = 0;



        while (counter < (n * m)) {

            //go right from ns to nf
            for (int i = ns; i <= nf; i++) {
                resultArr[counter] = arr[ms][i];
                counter++;
            }

            //go down, ms+1 to avoid listing corners twice
            for (int j = ms+1; j <= mf; j++) {
                resultArr[counter] = arr[j][nf];
                counter++;
            }

            //go left
            for (int k = nf-1; k >= ns; k--) {
                resultArr[counter] = arr[mf][k];
                counter++;
            }

            //go up, avoid corner
            for (int l = mf-1; l >= ms+1; l--) {
                resultArr[counter] = arr[l][ns];
                counter++;
            }

            //shrink dimensions
            ns++;
            nf--;
            ms++;
            mf--;
        }
        return resultArr;
    }

}
