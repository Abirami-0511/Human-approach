public class stringrev {
    public static void main(String args[]) {
      String s="good is all good ";
      s=s+"";
    int n=s.length();
    String rev="";
    String w="";
    for(int i=0;i<n;i++)
    {
        char ch=s.charAt(i);
        if(ch!=' '||ch==n)
        {
            w=w+ch;
        }
        else
        {
            rev=w+" "+rev;
            w="";
        }
    }
    System.out.println(rev);
    
    }
}


output:

good all is good 
