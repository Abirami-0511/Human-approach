public class Missingnum.java {
    public static void main(String args[]) {
     int a[]={1,2,3,4};
     int n=5;
     int r=0;
     int k=0;
     for(int i=0;i<=5;i++)
     {
          r=i+r;
     
    }
    for(int i=0;i<a.length;i++)
    {
        k=a[i]+k;
    }
    int p=r-k;
    System.out.println("the missing number is "+p);
    }
}

output:


the missing number is 5