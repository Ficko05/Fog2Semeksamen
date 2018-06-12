package FunctionLayer;

import FunctionLayer.Order;

public class Calculator {

    private int stolpeL = 4;
    private int rem = 2;
    private int spær, stolpeW, u19, bolt1012, firkantskiver404011;

    public Carport calculate(Order o) {
        int height = Math.abs(o.getHeight());
        int length = Math.abs(o.getLength());
        int width = Math.abs(o.getWidth());

        if (length >= 320) {
            stolpeL += ((length - 70) / 250) * 2;
        }

//        if (width >= 320) {
//            stolpeW += ((width - 70) / 250);
//        }
        spær = (length / 55);
        u19 = (spær*2);
        bolt1012 = (stolpeL + stolpeW);
        firkantskiver404011 = (stolpeL + stolpeW);

        return new Carport(stolpeL, stolpeW, rem, spær, u19, bolt1012, firkantskiver404011);
    }

}
