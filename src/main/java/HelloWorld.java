import java.util.Arrays;
import java.util.regex.*;

public class HelloWorld {

    public static boolean isInvisibleName(String names1){
        return names1.strip().isEmpty();
    }

    public static String makeNameClean(String name){
        String result = name.strip();
        result = "CLEAN" + result + "CLEAN";
        return result;
    }

    public static String makeHalfOfName(String name){
        int lengt = name.length() / 2;
        String result = name.substring(0,lengt);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(isInvisibleName(" \n"));
        System.out.println(makeNameClean(" Dima "));
        System.out.println(makeHalfOfName("Aphanasiy"));
        String hello = "12345";
        hello = hello.replaceAll("3", "");
        System.out.println(hello);


        System.out.println("John".equals("Doe"));

        int a1 = 10;
        char a2 = 'a';
        byte a3 = 10;
        short a4 = 32000;
        long a5 = 1000L;
        float a6 = 1.00f;
        double a7 = 1.00;

        long number = 365 * 24 * 60 * 60;
        System.out.println(number);

/*        String name1 = "Igor";
        String name2 = "Igore";
        System.out.println(name1.equals(name2));
        int lenght = name2.length();
        System.out.println(lenght);
        String firstName = "Elon";
        String lastName = "Musk";
        String fullname = firstName + " " + lastName + " 1996";
        System.out.println(fullname);

        String phrase = "Back to future";

        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());

        String word = "back";
        boolean phraseContains = phrase.contains("ta");
        System.out.println(phraseContains);

        System.out.println(phrase.toLowerCase().contains(word.toLowerCase()));

        // join(Разделитель, строка1, строка2, строка3, ...) - Соединение строк
        String joinString = String.join("", "Соединяем",  " Эти", " Строки");
        System.out.println(joinString);

        ~!@#$%^&
        //
*/
        float temp = 31/4f;

        System.out.println(temp);
        float quarterOfMayDayCount = Math.round(31/4f * 10.0f) / 10.0f;
 //       float quarterOfMayDayCount = Math.round(temp*100) / 100;
        float quarterOfMayDayCoun = 7.8f;



        char chsimvol = '5';
        int numb = 0;
        numb = chsimvol - '0';
        System.out.println(numb);
//        String names;
        String[] seasons = {"winter", "spring", "summer", "autumn"};
        for(String season : seasons){
            System.out.println("season = " + season);
        }
        
        String beliberda = "This is Sparta ghjj";
 //       String parts = beliberda.replaceAll("[^!,.;:]", "");
        int simbolscount = beliberda.replaceAll("[^!,.:;]", "").length();
        System.out.println("simbolscount = " + simbolscount);

        byte[] startBytes = {74, 97, 86, 97};
        System.out.println("startBytes.toString() = " + startBytes.toString());

        String[] argss = {"i", "!", "s"};
     //   String[] stroka = beliberda.split("[" +argss[1] + "]");
     //   String stroka = argss[0].replace(argss[0], "");
     //   System.out.println("new String(stroka = " + new String(Arrays.toString(stroka)));

        String[] arraywords = {"dvd", "Dva", "Tri"};
     //   StringBuilder Slovo = new StringBuilder();
     //   Slovo = arraywords[0].toString();
        if(new String(arraywords[0]) == new StringBuilder(arraywords[0]).reverse().toString()){
            System.out.println("Slovo = " + arraywords.toString());
        }

        String input = "profession";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed); // noisseforp
        
        
        String str12 = "111 dfsdf 3 sdf 67";
        System.out.println("str12.indexOf(\"1\") = " + str12.indexOf("\\D"));
        
        
//        Pattern p1 = Pattern.compile("\\d+&\\s+");
//        String text1 = "333 33";
//        Matcher matcher = p1.matcher(text1);
//        System.out.println("matcher.find() = " + matcher.find());


        String longPhrase = "guankigajygyceu ys";
        SummaryCreator summaryCreator = new SummaryCreator();


        System.out.println(summaryCreator.create(longPhrase));

        String text5 = "00+ff=0";
        boolean ref;
        ref = text5.matches("[0-9]");
        System.out.println("ref = " + ref);
        Pattern p1 = Pattern.compile("\\d+");
        Pattern p2 = Pattern.compile("[+*/-]");
        Pattern p3 = Pattern.compile("[=]");
        Matcher m1 = p1.matcher(text5);
        Matcher m2 = p2.matcher(text5);
        Matcher m3 = p3.matcher(text5);
        boolean resultMatcher = false;

     //   System.out.println("m1 = " + m1.find());
     //   System.out.println("m2 = " + m2.find());
     //   System.out.println("m3 = " + m3.find());
        if(m1.find() && m2.find() && m3.find()){
            resultMatcher = true;
        }
        System.out.println("Result = " + resultMatcher);


        String[] belcount = beliberda.split(" ");
        int contbel = belcount[0].length();
        System.out.println("contbel = " + contbel);

        int resultcount = 0;
        for(int i = 0; i < belcount.length; i++){
            int count = belcount[i].length();
            resultcount += count;
        }
        System.out.println("contbel = " + contbel);
        System.out.println("resultcount = " + resultcount);

        String wordsAndNum = "april 5, year 2000";
        int[] numbersStr = new int[wordsAndNum.length()];
        int j = 0;
        for (int i = 0; i < wordsAndNum.length(); i++){

            if((wordsAndNum.charAt(i) <= 57) && (wordsAndNum.charAt(i) >= 48)){
                numbersStr[j] = Integer.parseInt(String.valueOf(wordsAndNum.charAt(i)));
                j++;
            }
        }
        System.out.println("Arrays.toString(numbersStr) = " + Arrays.toString(numbersStr));
        
        Pattern p4 = Pattern.compile("\\d{1,}");
        Matcher m4 = p4.matcher(wordsAndNum);
        if(m4.find()){
            System.out.println("m4.group(0) = " + m4.group(0));
        }


        System.out.println(Arrays.toString(belcount));


    }
}
