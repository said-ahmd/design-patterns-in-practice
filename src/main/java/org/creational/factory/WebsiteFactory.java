package org.creational.factory;

public class WebsiteFactory {

    public static Website createWebsite(String type){
        switch (type){
            case "Blog":{
                return new BogWebsite();
            }
            case "Shop":{
                return new ShopWebsite();
            }
            default: return null;
        }
    }

}
