/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5_project_pro192;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.IOCE182102;

/**
 *
 * @author Nguyen Huy Hoang - CE182102
 */
public class CommodityList {
    IOCE182102 io = new IOCE182102();
    private List<Commodity> comList;

    public CommodityList() {
        comList = new ArrayList<Commodity>();
    }
    
    public void showCom() {
        for (Commodity commodity : comList) {
            commodity.showInfo();
        }
    }
    
    public void addCom() {
        String iCode = "";
        String iName = "";
        String categogy = "";
        String origin = "";
        Date DOM;
        Date ED;
        double price;
        
        do {            
            iCode = io.getString("Input ID: ", "ID must be exactly 2 characters", 2);
            if (searchGoodsById(iCode) != -1)
                System.out.println("This " + iCode + " is already exists!");
        } while (searchGoodsById(iCode) != -1);
        iName = iName.substring(0, 1).toUpperCase() + iName.substring(1);
        categogy = categogy.substring(0, 1).toUpperCase() + categogy.substring(1);
        origin = origin.substring(0, 1).toUpperCase() + origin.substring(1);
        DOM = ;
        ED = ;
        price = io.getDouble("Input price", "", 0);
        
        Commodity c = new Commodity(iCode, iName, categogy, origin, DOM, ED, 0);
    }
    
    public void updateCom() {
        
    }
    
    public void removeCom() {
        
    }
    
    public void removeAllCom() {
        
    }
    
    public void searchCom() {
        
    }
    
    public int searchGoodsById(String id) {
        for (int i = 0; i < comList.size(); i++) {
            if (comList.get(i).getiCode().equalsIgnoreCase(id))
                return i;
        }
        return -1;
    }
}
