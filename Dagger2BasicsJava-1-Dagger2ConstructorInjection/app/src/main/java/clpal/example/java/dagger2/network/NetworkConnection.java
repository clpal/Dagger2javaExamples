package clpal.example.java.dagger2.network;

import clpal.example.java.dagger2.BuildConfig;
import clpal.example.java.dagger2.basics.Constants;

import javax.inject.Inject;

public class NetworkConnection {
    private final String mEndpoint;
//Dependency to end Point
    @Inject
    public NetworkConnection(){

        if(BuildConfig.DEBUG){
            this.mEndpoint= Constants.DEBUG_ENDPOINT;
        }else {
            this.mEndpoint=Constants.PROD_ENDPOINT;
        }

    }
    public String doReq() {
        return this.mEndpoint;
    }

}

