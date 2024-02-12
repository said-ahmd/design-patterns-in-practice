package org.creational.factory;

import org.creational.factory.pages.AboutBage;
import org.creational.factory.pages.CartBage;
import org.creational.factory.pages.ContactBage;

public class BogWebsite extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new AboutBage());
        pages.add(new ContactBage());
    }
}
