package Proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InternetProxy implements Connect {
    private Internet i;
    private List<String> restrictedHosts;

    public InternetProxy() {
        i = new Internet();
        restrictedHosts = new ArrayList<>();
        initHosts();
    }

    public void initHosts() {
        restrictedHosts.add("google.com");
        restrictedHosts.add("facebook.com");
        restrictedHosts.add("youtube.com");
        restrictedHosts.add("linkedin.com");
    }

    @Override
    public void connect(String host) {
        if (!checkHost(host)) System.out.println("forbidden");
        else i.connect(host);
    }

    private Boolean checkHost(String host) {
        return !restrictedHosts.contains(host);
    }


}
