package FunctionLayer;

import FunctionLayer.Order;

public class Calculator {

    private int stolpeL = 4;
    private int rem = 2;
    private int spær, stolpeW;

    public Carport calculate(Order o) {
        int height = Math.abs(o.getHeight());
        int length = Math.abs(o.getLength());
        int width = Math.abs(o.getWidth());

        if (length >= 320) {
            stolpeL += ((length - 70) / 250) * 2;
        }

        if (width >= 320) {
            stolpeW += ((width - 70) / 250);
        }
        spær = (length / 55);

        return new Carport(stolpeL, stolpeW, rem, spær);
    }

}
