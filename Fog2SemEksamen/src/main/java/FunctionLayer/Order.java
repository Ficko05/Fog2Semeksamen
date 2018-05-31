
package FunctionLayer;

import java.sql.Date;
import java.sql.Timestamp;


public class Order {
    
        
   private int id,customer_id, length, width, height, roof_id, roof_angle, shed_id;
   private String customer_comment, status, type;
   private String date;

    public Order(int id, int customer_id, int length, int width, int height, int roof_id, int roof_angle, int shed_id, String customer_comment, String status, String date, String type) {
        this.id = id;
        this.customer_id = customer_id;
        this.length = length;
        this.width = width;
        this.height = height;
        this.roof_id = roof_id;
        this.roof_angle = roof_angle;
        this.shed_id = shed_id;
        this.customer_comment = customer_comment;
        this.status = status;
        this.date = date;
        this.type = type;
    }
    
    /**quick fix */
    public Order(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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

    public int getRoof_id() {
        return roof_id;
    }

    public void setRoof_id(int roof_id) {
        this.roof_id = roof_id;
    }

    public String getCustomer_comment() {
        return customer_comment;
    }

    public void setCustomer_comment(String customer_comment) {
        this.customer_comment = customer_comment;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRoof_angle() {
        return roof_angle;
    }

    public void setRoof_angle(int roof_angle) {
        this.roof_angle = roof_angle;
    }

    public int getShed_id() {
        return shed_id;
    }


    public void setShed_id(int shed_id) {
        this.shed_id = shed_id;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", customer_id=" + customer_id + ", length=" + length + ", width=" + width + ", height=" + height + ", roof_id=" + roof_id + ", roof_angle=" + roof_angle + ", shed_id=" + shed_id + ", customer_comment=" + customer_comment + ", status=" + status + ", type=" + type + ", date=" + date + '}';
    }

    
   
   
    
}
