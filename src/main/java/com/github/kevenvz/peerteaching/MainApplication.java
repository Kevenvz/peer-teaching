package com.github.kevenvz.peerteaching;

import com.github.kevenvz.peerteaching.resources.ServerResource;
import com.github.kevenvz.peerteaching.services.ServerService;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MainApplication extends Application<MainConfiguration> {
    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    public void run(MainConfiguration mainConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new ServerResource(new ServerService()));
    }
}
