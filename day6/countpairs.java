public class countpairs {
    public static void main(String args[]) {
 int a[]={1,3,4,2,5,6,7};
  int n=a.length;
  int r=6;
  int  sum=0;
  int count=0;
  for(int i=0;i<n;i++)
  {
      for(int j=i+1;j<n;j++)
      {
       sum=a[i]+a[j];   
        if(sum==r)
    {
        count+=1;
        System.out.println(a[i]+" and "+a[j]+" are the pairs that gives the sum of 6");
    }
      }
     
  }
    
    System.out.print("the number of pairs that gives the sum 6 is "+count);
    }
}

output:

1 and 5 are the pairs that gives the sum of 6
2 and 4 are the pairs that gives the sum of 6
the number of pairs that gives the sum 6 is 2
