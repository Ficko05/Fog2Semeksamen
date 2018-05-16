
package FunctionLayer;


public class Employee {
    
    private String username, password, email;
    private int id, phone, cpr;

    public Employee(String username, String password, String email, int phone, int cpr) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.cpr = cpr;
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

    public int getCpr() {
        return cpr;
    }

    public void setCpr(int cpr) {
        this.cpr = cpr;
    }
    
    
}
