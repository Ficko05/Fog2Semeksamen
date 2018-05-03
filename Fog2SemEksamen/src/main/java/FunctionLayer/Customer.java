
package FunctionLayer;


public class Customer {
    
    private String username, password, email;
    private int id, phone;
    private String comment;

    public Customer(String username, String password, String email, int id, int phone, String comment) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
        this.phone = phone;
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

   
    
    
}
