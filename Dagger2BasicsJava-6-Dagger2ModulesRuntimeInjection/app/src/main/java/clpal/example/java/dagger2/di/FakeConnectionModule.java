package clpal.example.java.dagger2.di;

import clpal.example.java.dagger2.network.Connection;
import clpal.example.java.dagger2.network.FakeConnection;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class FakeConnectionModule {

    @Binds
    abstract Connection provideConnection(FakeConnection connection);


}
