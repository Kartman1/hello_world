public class PointTest {
    public static void main(String[] args) {
        Pointt p1 = new Pointt(2, 2);

        Pointt p2 = new Pointt(5, 5);

        Pointt result = p1.add(p2);

        System.out.println("p1= " + p1);
        System.out.println("result = " + result);
    }
}
