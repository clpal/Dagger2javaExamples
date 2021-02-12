package clpal.example.java.dagger2.di;

import clpal.example.java.dagger2.MainActivity;
import clpal.example.java.dagger2.basics.MainViewModel;

import dagger.Component;
//# unit test is easy in Dagger change RealConnectionModule ,FakeConnectionModule
// @Component(modules = {DataStorageModule.class, RealConnectionModule.class,FakeConnectionModule.class})
// error generated bound multiple times Connection in same time we can not use same connection
@Component(modules = {DataStorageModule.class, RealConnectionModule.class})
public interface MainViewModelInjector {

    MainViewModel getMainViewModel();

    void injectFields(MainActivity mainActivity);

}
