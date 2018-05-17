package FunctionLayer;

import java.util.ArrayList;

public class BillOfMaterial {

    private ArrayList<Material> bom = new ArrayList();

    public ArrayList makeBom(Carport cp) {
        bom.add(new Material("97x97mm. trykimp. Stolpe", "stk", "Stolper nedgraves 90 cm. i jord + skråstiver", (cp.getStolpeL() + cp.getStolpeW())));
        bom.add(new Material("45x195mm. spærtræ ubh.", "stk", "Remme	i sider, sadles ned i stolper Carport del", cp.getRem()));
        bom.add(new Material("fædigskåret", "stk", "byg-selv spær", cp.getSpær()));
        bom.add(new Material("universal	190 mm", "stk", "Til montering af spær på rem", cp.getU19()));
        bom.add(new Material("bræddebolt 10x120mm.", "stk", "Til montering af rem på stolper", cp.getBolt1012()));
        bom.add(new Material("firkantskiver 40x40x11mm", "stk", "Til montering af rem på stolper", cp.getFirkantskiver404011()));
        return bom;
    }

    public static class Material {

        String name, format, description;
        int quantity;

        public Material(String navn, String format, String description, int quantity) {
            this.name = navn;
            this.format = format;
            this.description = description;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public String getFormat() {
            return format;
        }

        public String getDescription() {
            return description;
        }

        public int getQuantity() {
            return quantity;
        }

    }
}
