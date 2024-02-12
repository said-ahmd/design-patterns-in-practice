package org.creational.factory;

import org.creational.factory.pages.*;

public class ShopWebsite extends Website{

    @Override
    protected void createWebsite() {
        pages.add(new AboutBage());
        pages.add(new CartBage());
        pages.add(new ContactBage());
        pages.add(new SearchProduct());
        pages.add(new Item());
    }
}
