package entity;
// Generated Oct 18, 2016 5:58:45 PM by Hibernate Tools 4.3.1



/**
 * Cart generated by hbm2java
 */
public class Cart  implements java.io.Serializable {


     private String numberCart;
     private String number;
     private String username;
     private String code;
     private String name;
     private String price;
     private String image;
     private Product product;

    public Cart() {
    }

	
    public Cart(Product numberCart) {
        this.product = numberCart;
        this.number="1";
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart(String number, String username, String code, String name, String price, String image) {
        this.number = number;
        this.username = username;
        this.code = code;
        this.name = name;
        this.price = price;
        this.image = image;
       
    }
    
    
    public Cart(String numberCart, String number, String username, String code, String name, String price, String image) {
       this.numberCart = numberCart;
       this.number = number;
       this.username = username;
       this.code = code;
       this.name = name;
       this.price = price;
       this.image = image;
    }
   
    public String getNumberCart() {
        return this.numberCart;
    }
    
    public void setNumberCart(String numberCart) {
        this.numberCart = numberCart;
    }
    public String getNumber() {
        return this.number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }




}


