public class P16 {
    public static void printPattern(int n)
    {
        
        for(int i=0;i<n;i++)
        {
           for(char ch='A';ch<='A'+(n-i-1);ch++)
            {
                System.out.print(ch);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }

    
    
}
