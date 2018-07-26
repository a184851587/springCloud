package com.dufe.servicefeign.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class App extends ResourceConfig {

    public App() {
        packages("com.dufe.servicefeign.resource");
    }
}
