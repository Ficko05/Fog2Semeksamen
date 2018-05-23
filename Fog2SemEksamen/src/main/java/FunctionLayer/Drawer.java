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
        String svgStart = "<svg width=\"" + (order.getLength() + 100) + "\" height=\"" + (order.getWidth() + 100) + "\" viewBox=\"0 0 500 400\">";
        String tag = tag();
        String rem = rem();
        String stolpe = placeStolpe();
        String spær = placeSpær();
        String pile = pile();
        String mål = mål();
        String svgEnd = "<svg/>";
        String svg = svgStart + tag + rem + stolpe + spær + pile + mål + svgEnd;
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
        int afstand = (order.getLength() - 80) / ((carport.getStolpeL() / 2) - 1);
        for (int i = 0; i < carport.getStolpeL() / 2; i++) {
            String temp = stolpe;
            stolpe = temp + stolpe();
            x += afstand;
        }
        x = 35;
        y = (order.getWidth() - 45);
        for (int i = 0; i < carport.getStolpeL() / 2; i++) {
            String temp = stolpe;
            stolpe = temp + stolpe();
            x += afstand;
        }

//        x = order.getLength() - 45;
//        y = 35;
//        afstand = (order.getWidth() - 70) / (carport.getStolpeW() + 1);
//        if (carport.getStolpeW() > 0) {
//            for (int i = 0; i < carport.getStolpeW(); i++) {
//                y += afstand;
//                String temp = stolpe;
//                stolpe = temp + stolpe();
//            }
//        }
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
            x += afstand;
        }
        return spær;
    }

    private String pile() {
        String pil1 = "<marker id=\"beginArrow\" \n"
                + "            markerWidth=\"9\" markerHeight=\"9\" \n"
                + "            refX=\"0\" refY=\"4\" \n"
                + "            orient=\"auto\">\n"
                + "        <path d=\"M0,4 L8,0 L8,8 L0,4\" style=\"fill: #Black;\" />\n"
                + "    </marker>\n"
                + "    <marker id=\"endArrow\" \n"
                + "            markerWidth=\"9\" markerHeight=\"9\" \n"
                + "            refX=\"8\" refY=\"4\" \n"
                + "            orient=\"auto\">\n"
                + "        <path d=\"M0,0 L8,4 L0,8 L0,0\" style=\"fill: Black;\" />\n"
                + "    </marker>\n"
                + "    </defs>\n"
                + "    <line x1=\"0\"  y1=\"" + (order.getWidth() + 50) + "\" x2=\"" + order.getLength() + "\"   y2=\"" + (order.getWidth() + 50) + "\" \n"
                + "          style=\"stroke:Black; marker-start: url(#beginArrow); marker-end: url(#endArrow);\"/>";

        String pil2 = "<marker id=\"beginArrow\" \n"
                + "            markerWidth=\"9\" markerHeight=\"9\" \n"
                + "            refX=\"0\" refY=\"4\" \n"
                + "            orient=\"auto\">\n"
                + "        <path d=\"M0,4 L8,0 L8,8 L0,4\" style=\"fill: #Black;\" />\n"
                + "    </marker>\n"
                + "    <marker id=\"endArrow\" \n"
                + "            markerWidth=\"9\" markerHeight=\"9\" \n"
                + "            refX=\"8\" refY=\"4\" \n"
                + "            orient=\"auto\">\n"
                + "        <path d=\"M0,0 L8,4 L0,8 L0,0\" style=\"fill: Black;\" />\n"
                + "    </marker>\n"
                + "    </defs>\n"
                + "    <line x1=\"" + (order.getLength() + 50) + "\"  y1=\"0\" x2=\"" + (order.getLength() + 50) + "\"   y2=\"" + order.getWidth() + "\" \n"
                + "          style=\"stroke:Black; marker-start: url(#beginArrow); marker-end: url(#endArrow);\"/>";
        return pil1 + pil2;
    }

    private String mål() {
        String horri = "<text x=\"" + ((order.getLength()/100)*46) + "\"  y=\"" + (order.getWidth() + 30) + "\" >Længde:" + order.getLength() + "</text>";
        String verti = "<text x=\"" + (order.getLength() + 30) + "\" y=\"" + ((order.getWidth()/100)*46) + "\" style=\"writing-mode: tb; glyph-orientation-vertical: 0;\"> Brede:" + order.getWidth() + " </text>";
        return horri + verti;
    }
}
