public class max {
    public static void main(String args[]) {
     int temp;  
     int a[]={1,2,6,3,9,5};
     int n=a.length;
     
for (int i = 0; i < n; i++)   
        {  
            for (int j = i + 1; j < n; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }
       
        System.out.println("the third largest number in the array is "+a[n-3]);
    }
}

output:


the third largest number in the array is 5