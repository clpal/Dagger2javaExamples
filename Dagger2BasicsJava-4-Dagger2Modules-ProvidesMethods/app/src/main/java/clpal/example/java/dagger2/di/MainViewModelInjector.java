package clpal.example.java.dagger2.di;

import clpal.example.java.dagger2.MainActivity;
import clpal.example.java.dagger2.basics.MainViewModel;

import dagger.Component;
//compiler error (modules & provider)if we not pass modules DataStorageModule
@Component(modules = {DataStorageModule.class})
public interface MainViewModelInjector {

    MainViewModel getMainViewModel();

    void injectFields(MainActivity mainActivity);

}
