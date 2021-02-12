package clpal.example.java.dagger2.di;

import clpal.example.java.dagger2.Utils.DataStorageHelper;
import clpal.example.java.dagger2.Utils.Transaction;

import dagger.Module;
import dagger.Provides;

@Module
public class DataStorageModule {
//  3rd party libraies DataStorageHelper ,Transaction
    // naming coventions  provide
    @Provides
    public static Transaction provideTransaction() {
        return new Transaction(System.currentTimeMillis());
    }

    @Provides
    public static DataStorageHelper provideDataStorageHelper(Transaction transaction) {
        DataStorageHelper helper = new DataStorageHelper(transaction);
        // here we call constructor but we did not use @ annotation
        helper.setStoragePermission(true);
        return helper;
    }

}
