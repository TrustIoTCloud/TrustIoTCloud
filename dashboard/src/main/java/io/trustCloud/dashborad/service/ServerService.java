package io.trustCloud.dashborad.service;

import io.moquette.broker.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ServerService {
    @Autowired
    private Launcher launcher;


    public Server startServer() throws IOException, InterruptedException {
        return this.launcher.run();
    }
}
