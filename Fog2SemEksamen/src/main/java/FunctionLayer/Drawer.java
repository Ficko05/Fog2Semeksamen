package FunctionLayer;

public class Drawer {

    private int x, y;
    private Order order;
    private Calculator calc;
    private Carport carport;

    public Drawer(Order order) {
        this.order = order;
        this.calc = new Calculator();
        this.carport = calc.calculate(order);
    }

    public String SVG() {
        String svgStart = "<svg width=\"" + (order.getLength() + 100) + "\" height=\"" + (order.getWidth() + 100) + "\">";
        String tag = tag();
        String rem = rem();
//        Carport carport = calc.calculate(order);
        String stolpe = placeStolpe();
        String spær = placeSpær();
        String svgEnd = "<svg/>";
        String svg = svgStart + tag + rem + stolpe + spær + svgEnd;
        return svg;
    }

    private String tag() {
        return "<rect x=\"0\" y=\"0\" width=\"" + order.getLength() + "\" height=\"" + order.getWidth() + "\" style=\"stroke:black; fill:none\"/>";
    }

    private String spær() {
        return "<rect x=\"" + x + "\" y=" + y + " width=\"5\" height=\"" + order.getWidth() + "\" style=\"stroke:black; fill:none\"/>";

    }

    private String stolpe() {
        return "<rect x=\"" + x + "\" y=" + y + " width=\"10\" height=\"10\"/>";

    }

    private String rem() {
        String rem1 = "<rect x=\"0\" y=\"35\" width=\"" + order.getLength() + "\" height=\"5\" style=\"stroke:black; fill:none\"/>";
        String rem2 = "<rect x=\"0\" y=\" " + (order.getWidth() - 40) + " \" width=\"" + order.getLength() + "\" height=\"5\" style=\"stroke:black; fill:none\"/>";
        return rem1 + rem2;

    }

    private String supportRem(int x1, int y1, int x2, int y2) {
        String sRem1 = "<line x1=" + x1 + " y1=" + y1 + "x2=" + x2 + " y2=" + y2 + "/>";
        String sRem2 = "<line x1=" + x1 + " y1=" + y2 + "x2=" + x2 + " y2=" + y1 + "/>";
        return sRem1 + sRem2;
    }

    private String placeStolpe() {
        String stolpe = "";
        x = 35;
        y = 35;
        int afstand = (order.getLength() - 80) / ((carport.getStopleL() / 2) - 1);
        for (int i = 0; i < carport.getStopleL() / 2; i++) {
            String temp = stolpe;
            stolpe = temp + stolpe();
            x += afstand;
        }
        x = 35;
        y = (order.getWidth() - 45);
        for (int i = 0; i < carport.getStopleL() / 2; i++) {
            String temp = stolpe;
            stolpe = temp + stolpe();
            x += afstand;
        }

        x = order.getLength() - 45;
        y = 35;
        afstand = (order.getWidth() - 70) / (carport.getStopleW() + 1);
        if (carport.getStopleW() >= 1) {
            for (int i = 0; i < carport.getStopleW(); i++) {
                y += afstand;
                String temp = stolpe;
                stolpe = temp + stolpe();

            }

        }
        return stolpe;
    }

    private String placeSpær() {
        String spær = "";
        x = 0;
        y = 0;
        int afstand = order.getLength() / (carport.getSpær());
        for (int i = 0; i < carport.getSpær(); i++) {
            String temp = spær;
            spær = temp + spær();
            x += afstand + 5;
        }
        return spær;
    }
}
