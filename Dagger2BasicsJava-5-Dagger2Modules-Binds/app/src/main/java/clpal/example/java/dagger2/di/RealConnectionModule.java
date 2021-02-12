package clpal.example.java.dagger2.di;

import clpal.example.java.dagger2.network.Connection;
import clpal.example.java.dagger2.network.RealConnection;

import dagger.Binds;
import dagger.Module;

@Module
public interface RealConnectionModule {
    // binds RealConnection class
    @Binds
    Connection bindsConnection(RealConnection connection);


}
