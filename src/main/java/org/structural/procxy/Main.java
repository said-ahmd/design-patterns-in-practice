package org.structural.procxy;

public class Main {
    public static void main(String[] args) {
        Image proxyImage1 = new ImgeProxy("sky.png");
        proxyImage1.display();

        Image proxyImage2 = new ImgeProxy("sky.png");
        proxyImage2.display();

    }
}
