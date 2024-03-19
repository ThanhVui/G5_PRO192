/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5_project_pro192;

import java.util.Date;

/**
 *
 * @author Nguyen Huy Hoang - CE182102
 */
public class Commodity extends CommodityOrigin{
    private String iCode;
    private String iName;
    private String categogy;
    private String origin;
    private Date DOM;
    private Date ED;
    private double price;

    public Commodity() {
    }

    public Commodity(String iCode, String iName, String categogy, String origin, Date DOM, Date ED, double price) {
        this.iCode = iCode;
        this.iName = iName;
        this.categogy = categogy;
        this.origin = origin;
        this.DOM = DOM;
        this.ED = ED;
        this.price = price;
    }

    public String getiCode() {
        return iCode;
    }

    public void setiCode(String iCode) {
        this.iCode = iCode;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public String getCategogy() {
        return categogy;
    }

    public void setCategogy(String categogy) {
        this.categogy = categogy;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getDOM() {
        return DOM;
    }

    public void setDOM(Date DOM) {
        this.DOM = DOM;
    }

    public Date getED() {
        return ED;
    }

    public void setED(Date ED) {
        this.ED = ED;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String showInfo() {
        String str;
        str = String.format("|%s|%s|%s|%s|%s|%s|%f|", 
                iCode, iName, categogy, origin, DOM, ED, price); 
        return str;
    }
}
