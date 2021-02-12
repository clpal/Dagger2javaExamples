package clpal.example.java.dagger2.di;

import clpal.example.java.dagger2.Utils.DataStorageHelper;
import clpal.example.java.dagger2.Utils.Transaction;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DataStorageModule {

    @Provides
    public static Transaction provideTransaction() {
        return new Transaction(System.currentTimeMillis());
    }

    @Provides
    public static DataStorageHelper provideDataStorageHelper(Transaction transaction) {
        DataStorageHelper helper = new DataStorageHelper(transaction);
        helper.setStoragePermission(true);
        return helper;
    }

}
