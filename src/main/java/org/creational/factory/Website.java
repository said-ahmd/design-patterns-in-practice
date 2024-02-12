package org.creational.factory;

import org.creational.factory.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    List<Page> pages = new ArrayList<>();

    Website(){
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }
}
