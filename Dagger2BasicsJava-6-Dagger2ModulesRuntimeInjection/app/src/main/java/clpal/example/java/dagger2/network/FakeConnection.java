package clpal.example.java.dagger2.network;

import javax.inject.Inject;

public class FakeConnection implements Connection {

    @Inject
    public FakeConnection() {

    }

    @Override
    public String doReq() {
        return "This is testing connection";
    }
}
