public class uniqueelement {
    public static void main(String args[]) {
     
      int a[]={10,3,2,4,8,5,3,9,5};
 int n=a.length;
 int count=0;
 for(int i=0;i<=n;i++)
 {
     for(int j=i+1;j<n;j++)
     {
         if(a[i]==a[j])
         {
            a[i]=-1;
            a[j]=-1;
         }
    }
 }
 for(int i=0;i<n;i++)
 {
  if(a[i]!=-1)
         {   
             System.out.print(a[i]+" ");
         }
 }
}
}

 }

output:

10 2 4 8 9 
