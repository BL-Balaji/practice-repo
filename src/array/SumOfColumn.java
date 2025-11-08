package array;

public class SumOfColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       int sumOfColumn = 0;
       for(int j = 0; j < matrix.length; j++)
       {
           for(int i = 0; i < matrix[0].length; i++)
           {
               sumOfColumn = sumOfColumn + matrix[i][j];
           }
           System.out.println("sum of "+(j+1)+" column element is : "+sumOfColumn);
           sumOfColumn = 0;
       }
    }
}
