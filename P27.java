
public class P27 {
    public static void printPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=n/2 && j<=i  || j==n-i-1   )
                {
                    System.out.print(" * ");
                }

                
                
                }
                System.out.println();


            }
            

        }
    
    public static void main(String[] args) {
        printPattern(9);

    }

    
}