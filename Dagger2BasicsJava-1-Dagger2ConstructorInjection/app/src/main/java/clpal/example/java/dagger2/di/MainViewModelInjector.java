package clpal.example.java.dagger2.di;

import clpal.example.java.dagger2.basics.MainViewModel;

import dagger.Component;
// top level component
@Component
public interface MainViewModelInjector {
  // MainViewModel return type of abstract getMainViewModel() method
    MainViewModel getMainViewModel();

}
