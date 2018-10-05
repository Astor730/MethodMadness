public class AMeredithGoujonlib {
    public static String dateStr(String date)
    {
        if (date.length()>10)
        {
            String output= "Date is too long";
            return output;
        }
        else
        {
            String mm = date.substring(0,2);
            String dd = date.substring(3,5);
            String yyyy = date.substring(6,date.length());
            String orgdate = dd + " - " + mm + " - " + yyyy;
            return orgdate;
        }

    }
    public static boolean isPalindrome(String word)
    {
        String wordBack = word.substring(word.length()-1,word.length());
        for (int i = 1; i<word.length();i++)
        {
            wordBack = wordBack + word.substring(word.length()-i-1,word.length()-i);
        }
        if (word.equalsIgnoreCase(wordBack))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int sumUpTo(int x)
    {
        int o = 0;
        for(int i = 0; i<= x; i++)
        {
            o = o+i;
        }
        return o;
    }
    public static void multiplicationTable(int b, int r)
    {
        for(int i = 0;i<r;i++)
        {
            System.out.println(b*i);
        }
    }
    public static void fooBarBaz(int num1)
    {
        for(int i = 0; i<num1;i++)
        {
            if (num1%3==0 && num1%5==0)
            {
                System.out.println("baz");
            }
            else if(num1%3 == 0)
            {
                System.out.println("foo");
            }
            else if (num1%5 ==0)
            {
                System.out.println("bar");
            }
            else
            {
                System.out.println(num1);
            }
        }
    }
}
