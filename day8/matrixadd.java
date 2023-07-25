public class matrixadd {
    public static void main(String args[]) {
      int a[][]={{1,2,3},{4,5,6},{7,8,9}};
      int b[][]={{6,7,8},{3,4,6},{8,4,6}};
      int c[][]=new int[3][3];
      for(int i=0;i<a.length;i++)
      {
          for(int j=0;j<a[0].length;j++)
          {
              c[i][j]=a[i][j]+b[i][j];
              System.out.print(c[i][j]+"   ");
          }
          System.out.println();
      }
    }
}

output:

7   9   11   
7   9   12   
15  12  15  