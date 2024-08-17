public class P17 {
    public static void printPattern(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }
            for(int k=0;k<2*i;k++)
            {
                System.out.print(" ");
            }
            for(int l=n;l>i;l--)
            {
                System.out.print("*");
            }
            System.out.println();
            

        }
        int space=2*n-2;
        for(int m=0;m<n;m++)
        {
            for(int j=0;j<=m;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<=m;l++)
            {
                System.out.print("*");
            }
           
            System.out.println();
            space=space-2;




            
        }





    }
    public static void main(String[] args) {
        printPattern(5);
    }
    
}
