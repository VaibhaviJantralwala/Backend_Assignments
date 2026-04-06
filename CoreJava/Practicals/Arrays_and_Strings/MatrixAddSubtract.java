package Arrays_and_Strings;

public class MatrixAddSubtract {
    public static void main(String[] args) {
        
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};

        int[][] add = matrixAdd(a,b);
        for(int i=0 ; i<add.length ; i++){
            for(int j=0 ; j<add[0].length ; j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }

        int[][] sub = matrixSub(a,b);
        for(int i=0 ; i<sub.length ; i++){
            for(int j=0 ; j<sub[0].length ; j++){
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixSub(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<a[0].length ; j++){
                res[i][j] = a[i][j]+b[i][j];
            }
        }
        return res;
    }

    private static int[][] matrixAdd(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<a[0].length ; j++){
                res[i][j] = a[i][j]-b[i][j];
            }
        }
        return res;
    }
}

// output :
// $ java MatrixAddSubtract
// -4 -4 
// -4 -4 
// 6 8 
// 10 12 

