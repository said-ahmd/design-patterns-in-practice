package org.structural.procxy;

import java.util.HashMap;
import java.util.Map;

public class ImgeProxy implements Image {
    private final String fileName;
    private RealImage realImage;
    private static final Map<String, RealImage> imageCache = new HashMap<>();
    public ImgeProxy(String fileName){
        this.fileName=fileName;
    }

    @Override
    public void display() {
        if(imageCache.containsKey(fileName)){
            realImage = imageCache.get(fileName);
        }
        else {
            realImage = new RealImage(fileName);
            imageCache.put(fileName,realImage);
        }

        realImage.display();

    }
}
