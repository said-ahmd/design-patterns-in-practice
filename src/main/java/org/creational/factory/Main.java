package org.creational.factory;

public class Main {
    public static void main(String[] args) {
        Website shopWebsite = WebsiteFactory.createWebsite("Shop");
        shopWebsite.getPages()
                .forEach(System.out::println);

        System.out.println("\n");

        Website blogWebsite = WebsiteFactory.createWebsite("Blog");
        blogWebsite.getPages()
                .forEach(System.out::println);

    }
}
