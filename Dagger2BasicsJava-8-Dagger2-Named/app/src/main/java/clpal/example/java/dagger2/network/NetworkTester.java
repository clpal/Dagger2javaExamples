package clpal.example.java.dagger2.network;

import android.util.Log;

import javax.inject.Inject;

import static clpal.example.java.dagger2.basics.Constants.TAG;

public class NetworkTester {

    @Inject
    public NetworkTester() {
    }

    public void attachToNetwork(NetworkClient client) {
        Log.d(TAG, "attachToNetwork: attached to network");
    }
}
