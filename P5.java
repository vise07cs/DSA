

public class P5 {
    public static void printPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
    
}
