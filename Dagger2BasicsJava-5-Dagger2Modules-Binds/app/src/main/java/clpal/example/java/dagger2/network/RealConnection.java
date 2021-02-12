package clpal.example.java.dagger2.network;

import clpal.example.java.dagger2.BuildConfig;
import clpal.example.java.dagger2.basics.Constants;

import javax.inject.Inject;

public class RealConnection implements Connection {
    //interface implement in  class then we can use interface simply
    private final String mEndpoint;

    @Inject
    public RealConnection() {

        if (BuildConfig.DEBUG) {
            this.mEndpoint = Constants.DEBUG_ENDPOINT;
        } else {
            this.mEndpoint = Constants.PROD_ENDPOINT;
        }

    }

    @Override
    public String doReq() {
        return mEndpoint;
    }
}
