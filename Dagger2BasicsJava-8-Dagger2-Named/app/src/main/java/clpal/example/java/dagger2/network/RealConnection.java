package clpal.example.java.dagger2.network;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import static clpal.example.java.dagger2.basics.Constants.TAG;

public class RealConnection implements Connection {

    private final String mEndpoint;
    private String mUsername;
    private String mPassword;

    @Inject
    public RealConnection(@Named("endpoint") String mEndpoint,
                          @Named("username") String mUsername,
                          @Named("password") String mPassword) {
        this.mEndpoint = mEndpoint;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
    }

    @Override
    public String doReq() {
        Log.d(TAG, "doReq: Username: " + mUsername + " Password: " + mPassword);
        return mEndpoint;
    }
}
