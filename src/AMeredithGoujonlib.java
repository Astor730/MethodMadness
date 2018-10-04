public class AMeredithGoujonlib {
    public static int sumUpTo (int x)
    {
        int sum = 0;
        for (int i = 0; i <= x; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
    public static void multiplicationTable(int b, int r)
    {
        int o = 0;
        for(int i = 0; i<r;i++)
        {
            o= b*i;
            System.out.println(o);
        }
    }
}
