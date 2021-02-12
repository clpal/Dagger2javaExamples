package clpal.example.java.dagger2.di;

import clpal.example.java.dagger2.network.Connection;
import clpal.example.java.dagger2.network.RealConnection;

import dagger.Module;
import dagger.Provides;

@Module
public class RealConnectionModule {

//    private String mEndPoint;
//
//    public RealConnectionModule(String mEndPoint) {
//        this.mEndPoint = mEndPoint;
//    }
//
//    @Provides
//    String provideEndpoint(){
//        return this.mEndPoint;
//    }

    @Provides
    Connection provideConnection(RealConnection connection) {
        return connection;
    }


}
