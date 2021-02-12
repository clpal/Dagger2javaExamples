package clpal.example.java.dagger2.network;


import javax.inject.Inject;

public class NetworkClient {

    private final NetworkConnection mConnection;
    // Constructor Dependency
    @Inject
    public NetworkClient(NetworkConnection connection) {
        this.mConnection = connection;
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}