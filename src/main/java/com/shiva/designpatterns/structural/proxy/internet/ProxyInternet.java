package com.shiva.designpatterns.structural.proxy.internet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-09-03 16:55
 **/


public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;


    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }


    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase()))  {
            throw new Exception("Access Denied to connect to: "+serverHost);
        }
        internet.connectTo(serverHost);
    }
}
