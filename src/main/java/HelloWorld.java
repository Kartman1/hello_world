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


        

    }
}
