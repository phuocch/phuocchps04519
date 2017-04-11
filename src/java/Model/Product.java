/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author phuoc
 */
public class Product {
    private String code;
    private String name;
    private String price;
    private String image;

    public Product(String code, String name, String price,String image) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.image=image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public static void main(String[] args) {
         Products sp=new Products();
         sp.InsertProduct("a","a","a","a");
    }
}
