package constructors;

class Task9 {
    public static void main(String[] args) {
        for(int i = 0; i < 1; i++) {
            new AI();
        }
    }
}

class AI{
    static{
        System.out.println("firs");
    }

    public AI(){
        System.out.println("second");
    }
    
    int a;
    int b;
    

    int result = getDevide();

    private int getDevide() {
        return getDevide(a, b);
    }


}

