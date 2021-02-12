package clpal.example.java.dagger2.di;

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
        Builder setEndPoint(String endPoint);

    }

}
