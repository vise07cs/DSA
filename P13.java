public class P13 {
    public static void printPattern(int n)
    {
        int space =2*(n-1);
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println();
            space=space-2;
           

        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }

    
    
}
