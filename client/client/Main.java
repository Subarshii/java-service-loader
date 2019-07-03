package client;

import java.util.ServiceLoader;
import store.api.*;

public class Main{
    public static void main(String[] args){
        ServiceLoader<StoreService> storeServices = ServiceLoader.load(StoreService.class);
        for(StoreService storeService :storeServices){
            storeService.save("Hello");
        }
    }
}