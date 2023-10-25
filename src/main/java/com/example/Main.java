package com.example;

import com.example.service.MockRestService;
import com.example.service.MockSoapService;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class Main {

    public static void main(String[] args) throws Exception {
        var handler = new ServletHandler();
        var server = new Server(8080);
        server.setHandler(handler);

        handler.addServletWithMapping(MockSoapService.class, "/soap");
        handler.addServletWithMapping(MockRestService.class, "/rest");

        server.start();
        server.join();
    }
}
