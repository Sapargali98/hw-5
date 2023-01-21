public class Main {
    public static void main(String[] args) {

        double x = 25;
        double y = 37;
        double z = 29;
        double a=25;
        double b=45;
        double c=65;
        //System.out.print("Наименьшее значение: " + smallest(x, y, z));
        System.out.println();
        System.out.print("#2 "+ "Среднее значение " + average(a, b, c));
        System.out.println();
        String name = "DarTech123";
        System.out.print("#3 "+ "Количество гласных в строке: " + count_Vowels(name));
        System.out.println();
        String myWords = "Java is good to learn Object Oriented programming.";
        System.out.print("#4 "+ "Количество слов в строке: " + count_Words(myWords));
        System.out.println();
        String number1 ="1254212";
        System.out.print("#5.1 "+ "Количество цифр 2: " + count_numbers(number1));
        System.out.println();
        String name5="AIEEE";
        System.out.println("#5.2 " + myCount(name5));
        System.out.println();
        int myDigits = 252;
        System.out.println("#7 "+ "Сумма =  " + sumDigits(myDigits));
    }
    /*
    public static double smallest (double x,double y,double z) {
        if ((x>y)<z) {
            return x;
        } else  {
            return y;
        }
    }

     */


        public static double average(double a, double b, double c)
    {
        return (a+b+c) / 3;
    }
    public static int count_Vowels(String name)
    {

        int count = 0;
        for (int i = 0; i < name.length(); i++)
        {
            if (name.charAt(i) =='a' || name.charAt(i) =='e')
            {
                count++;
            }
        }

        return count;
    }


    public static int count_Words(String myWords)
    {
        int count = 0;
        if (!(" ".equals(myWords.substring(0, 1))) || !(" ".equals(myWords.substring(myWords.length() - 1))))
        {
            for (int i = 0; i < myWords.length(); i++)
            {
                if (myWords.charAt(i) ==' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }


    public static int count_numbers(String number1)
        {
        int count = 0;
        for (int i = 0; i < number1.length(); i++)
        {
            if (number1.charAt(i) =='2')
            {
                count++;
            }
        }
        return count;
    }
    public static int myCount(String name5)
    {  boolean isFound = false;int count= 0;
        for (int i = 0; i < name5.length(); i++)
        {
            if (name5.charAt(i) =='A' || name5.charAt(i) =='E'|| name5.charAt(i) =='O'|| name5.charAt(i) =='I')
            {
                count++;
                isFound = true;
            }
        }
        System.out.println(isFound);
        return count;

    }


    public static int sumDigits(long n) {
        int result = 0;
        while(n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;

    }
}

