package FunctionLayer;

import java.awt.List;


public class Calculate {

   

    public static Bricks orderCalculator(Order order)  {
        int w = order.getWidth();
        int l = order.getLength();
        int h = order.getHeight();
        int four = 0;
        int two = 0;
        int one = 0;

        if (w < 6 || l < 6 || h > 1) {
            System.out.println("to small");
        }

        if (l % 2 == 1) {
            l -= 1;
            one += 2;
        }
        if (w % 2 == 1) {
            w -= 1;
            one +=2;
        }

        four = (((l * 2) + (w * 2) - (4 * 2)) / 4) ;
        int cal = ((l * 2) + (w * 2) - (4 * 2)) % 4;

        if (cal == 2) {
            two += 1;
        }

        four *= h;
        two *= h;
        one *= h;
        
        Bricks bricks = new Bricks(four, two, one);
        return bricks;
    }
    }

