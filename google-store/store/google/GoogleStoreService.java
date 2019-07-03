package store.google;

public class GoogleStoreService implements  store.api.StoreService  {
   @Override
    public void save(String data){
        System.out.println("save data "+data+" to Google store ....");
    }
}
