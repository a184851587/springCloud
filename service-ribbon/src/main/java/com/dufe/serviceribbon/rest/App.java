package com.dufe.serviceribbon.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class App extends ResourceConfig {

    public App() {
        packages("com.dufe.serviceribbon.resource");
    }
}
