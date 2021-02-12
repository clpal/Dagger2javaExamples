package clpal.example.java.dagger2.network;


import javax.inject.Inject;

public class NetworkClient {

    private final NetworkConnection mConnection;

    @Inject
    public NetworkClient(NetworkConnection connection) {
        this.mConnection = connection;
    }
// method @Inject DI
    @Inject
    public void attachToNetworkTester(NetworkTester tester) {
        tester.attachToNetwork(this);
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}