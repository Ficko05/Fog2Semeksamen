
package FunctionLayer;


public class Order {
    
        
   private int length;
   private int width;
   private int height;


    public Order(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
     
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    
   
}
