package constructors;

class Task9 {
    public static String result = "";
    public static String text = "https://sdf.sdf.f";
    public static int index;
    public static void main(String[] args) throws ErroreMessage {
        for(int i = 0; i < 1; i++) {
            new AI();
        }
        String txt = "abc abc abc abc";

        int count = txt.split(" ", -1).length - 1;
        System.out.println("count = " + count);
        System.out.println(txt.toLowerCase());
    }
}

class AI{
    static{
        System.out.println("firs");
    }

    public AI() throws ErroreMessage {
        System.out.println("second");
    }
    
    int a = 100;
    int b = 10;
    

    int result = getDevide(a, b);

    private int getDevide(int a, int b) throws ErroreMessage{
        try{
            if(a/b <5){
                throw new ErroreMessage();
            }
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("e = " + e);
        }
        return 0;
    }


}

class ErroreMessage extends Exception{
    ErroreMessage(){
        super("Ошибка принудительная");
    }
}

