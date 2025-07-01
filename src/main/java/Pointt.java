public class Pointt {
    private final int x;
    private final int y;

    public Pointt(int x, int y){
        this.x = x;
        this.y = y;
    }

//    //Mutable
//    public void add(Pointt pointt){
//        this.x += pointt.x;
//        this.y += pointt.y;
//    }

    //Immutable
    public Pointt add(Pointt pointt){
        return new Pointt(this.x + pointt.x, this.y + pointt.y);
    }


    @Override
    public String toString(){
        return "Pointt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
