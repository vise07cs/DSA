

public class P7 {
    public static void printPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print((n+1)-j + " ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
    
}
