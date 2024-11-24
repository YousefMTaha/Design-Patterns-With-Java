package Proxy;

public class Internet implements Connect {

    @Override
    public void connect(String host) {
        System.out.println("Connected to Internet: " + host);
    }
}
