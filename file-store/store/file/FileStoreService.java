package store.file;

public class FileStoreService implements store.api.StoreService{
    @Override
    public void save(String data){
        System.out.println("save data "+data+" to file...");
    }
}