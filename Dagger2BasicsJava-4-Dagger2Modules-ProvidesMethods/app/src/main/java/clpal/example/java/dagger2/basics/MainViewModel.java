package clpal.example.java.dagger2.basics;

import clpal.example.java.dagger2.Utils.DataStorageHelper;
import clpal.example.java.dagger2.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    private final NetworkClient mClient;
    private final DataStorageHelper mDataStorageHelper;
// 3rd party libraries DataStorageHelper we can 't change
    @Inject
    public MainViewModel(NetworkClient networkClient,
                         DataStorageHelper dataStorageHelper) {
        this.mClient = networkClient;
        this.mDataStorageHelper = dataStorageHelper;
    }

    public String fetchData(){
        String data = mClient.fetchData();
        mDataStorageHelper.storeData(data);
        return data;
    }
}