package com.github.kevenvz.peerteaching.services;

import com.github.kevenvz.peerteaching.models.Server;
import com.google.common.base.Optional;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class ServerService {
    private final AtomicLong counter;
    private Map<Long, Server> serverStorage;

    public ServerService() {
        this.counter = new AtomicLong();
        this.serverStorage = new HashMap<Long, Server>();
    }

    public Optional<Server> getServer(Long id) {
        return Optional.fromNullable(serverStorage.get(id));
    }

    public Map<Long, Server> getServerStorage() {
        return serverStorage;
    }

    public Server addServer(Server server) {
        Long serverId = counter.incrementAndGet();

        server.setId(serverId);
        serverStorage.put(serverId, server);

        return server;
    }

    public Boolean deleteServer(Long id) {
        return serverStorage.remove(id) != null;
    }
}
