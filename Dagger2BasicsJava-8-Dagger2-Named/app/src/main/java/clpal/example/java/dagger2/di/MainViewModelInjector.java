package clpal.example.java.dagger2.di;

import javax.inject.Named;

import clpal.example.java.dagger2.MainActivity;
import clpal.example.java.dagger2.basics.MainViewModel;
import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {DataStorageModule.class, RealConnectionModule.class})
public interface MainViewModelInjector {

    MainViewModel getMainViewModel();

    void injectFields(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        MainViewModelInjector build();

        @BindsInstance
        Builder setEndPoint(@Named("endpoint") String endPoint);

        @BindsInstance
        Builder setUsername(@Named("username") String username);

        @BindsInstance
        Builder setPassword(@Named("password") String password);

    }

}
