package clpal.example.java.dagger2.network;

public class RealConnection implements Connection {

    private final String mEndpoint;

    public RealConnection(String endpoint) {
        this.mEndpoint = endpoint;

//        if (BuildConfig.DEBUG) {
//            this.mEndpoint = Constants.DEBUG_ENDPOINT;
//        } else {
//            this.mEndpoint = Constants.PROD_ENDPOINT;
//        }

    }

    @Override
    public String doReq() {
        return mEndpoint;
    }
}
