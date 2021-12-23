class TwelveDaysOfChristmas
{

    public static void main(String[] args)
    {
        String[] days = new String[12];
        days[0] = "and a partridge in a pear tree.";
        days[1] = "Two turtle doves, ";
        days[2] = "Three french hens, ";
        days[3] = "Four callings birds, ";
        days[4] = "Five diamond rings, ";
        days[5] = "Six geese a-laying, ";
        days[6] = "Seven swans a-swimming, ";
        days[7] = "Eight maids a-milking, ";
        days[8] = "Nine ladies dancing, ";
        days[9] = "Ten lords a-leaping, ";
        days[10] = "Eleven pipers piping, ";
        days[11] = "Twelve twelve drummers drumming, ";


        System.out.print(chorus(0));
        System.out.println("a partridge in a pear tree");

        for(int i = 1; i<days.length; i++)
        {
            System.out.print(chorus(i));

            for(int x = i; x>=0; x--)
            {
                System.out.print(days[x]);
            }
            System.out.println();
        }
    }

    public static String chorus(int line)
    {
        String chorus = "On the " + getLine(line) + " day of Christmas my true " +
                "love gave to me, ";

        return chorus;
    }

    public static String getLine(int line)
    {
        int num = line;
        String result = "first";
        switch (num)
        {
            case 1:  result = "second";
                break;
            case 2:  result = "third";
                break;
            case 3:  result = "fourth";
                break;
            case 4:  result = "fifth";
                break;
            case 5:  result = "sixth";
                break;
            case 6:  result = "seventh";
                break;
            case 7:  result = "eighth";
                break;
            case 8:  result = "ninth";
                break;
            case 9: result = "tenth";
                break;
            case 10: result = "eleventh";
                break;
            case 11: result = "twelfth";
                break;
        }

        return result;
    }

}
