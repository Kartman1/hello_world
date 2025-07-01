public class SumTests {
    public static void main(String[] args) {
        System.out.println("sum(3.5f,5) = " + sum(5.5f , 5));
        System.out.println("sum(5d, 3f) " + sum(5d, 3f));
    }
    

    public static  <T extends Number>  double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
}
