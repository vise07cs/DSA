public class P12 {
    public static void printPattern(int n)
    {
        int start=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(start+ " ");
                start=start+1;
            }
            System.out.println();

            }
           
        
    }
    public static void main(String[] args) {
        printPattern(5);
    }

    
    
}
