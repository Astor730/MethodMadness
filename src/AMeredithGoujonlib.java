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

}
