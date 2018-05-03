package FunctionLayer;


public class Bricks {
    
    int four;
    int two;
    int one;

    public Bricks(int four, int two, int one) {
        this.four = four;
        this.two = two;
        this.one = one;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    @Override
    public String toString() {
        return "Bricks{" + "four=" + four + ", two=" + two + ", one=" + one + '}';
    }
    
}
