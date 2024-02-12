package org.structural.procxy;


public class RealImage implements Image{

    private String fileName;
    public RealImage(String fileName){
        this.fileName=fileName;
        loadTheImageFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("The image :)");
    }
    public void loadTheImageFromDisk(String fileName){
        System.out.println("The "+fileName+" loading ....");
    }

}
