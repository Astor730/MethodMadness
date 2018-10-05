public class AMeredithGoujonlib {
    /**changes a date in mm/dd/yyyy format to dd - mm - yyyy format
     * if the string entered is longer than 10 the function does not run
     * @param date is the parameter entered in mm/dd/yyyy format
     * @return a string that is in the dd - mm - yyyy format
     */
    public static String dateStr(String date)
    {
        if (date.length()>10)
        {
            String output = "Date is too long";
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

    /**Checks to see if a word is a palindrome
     *
     * @param word is the word to be checked
     * @return return a boolean that says if the word is a palindrome or not
     */

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

    /**
     * This function outputs the sum off all numbers up to the parameter
     * @param x is the number to add up to
     * @return returns the sum
     */
    public static int sumUpTo(int x)
    {
        int o = 0;
        for(int i = 0; i<= x; i++)
        {
            o = o+i;
        }
        return o;
    }

    /**
     * This function prints a multiplication table with products of a number up to another number
     * @param b the number that is mulitplied
     * @param r the number that b multiplies up to
     * @return void
     */
    public static void multiplicationTable(int b, int r)
    {
        for(int i = 0;i<=r;i++)
        {
            System.out.println(b*i);
        }
    }

    /**
     * prints a string of numbers up to a number given
     * @param num1 is the number that the string prints up to
     * @return a void
     */
    public static void fooBarBaz(int num1)
    {
        for(int i = 1; i<=num1;i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("baz");
            }
            else if(i%3 == 0)
            {
                System.out.println("foo");
            }
            else if (i%5 ==0)
            {
                System.out.println("bar");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
