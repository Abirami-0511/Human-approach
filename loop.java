public class loop {
    public static void main(String args[]) {
        int n=5;
        int size=2*n-1;
 int a[][]=new int[size][size];

 int s=0;
  int e=size-1;
 while(n!=0)
 {
 for(int i=s;i<=e;i++)
 {
     for(int j=s;j<=e;j++)
     {
         if(i==s||j==s||i==e||j==e)
         {
             a[i][j]=n;
         }
     }
 }
 ++s;
 --e;
 --n;
    }
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
        
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
    return;
}
}

output:

5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5