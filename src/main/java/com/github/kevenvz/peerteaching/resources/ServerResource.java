package com.github.kevenvz.peerteaching.resources;

import com.codahale.metrics.annotation.Timed;
import com.github.kevenvz.peerteaching.models.Server;
import com.github.kevenvz.peerteaching.services.ServerService;
import com.google.common.base.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/server")
@Produces(MediaType.APPLICATION_JSON)
public class ServerResource {
    private final ServerService serverService;

    public ServerResource(ServerService serverService) {
        this.serverService = serverService;
    }

    @GET
    @Timed
    public List<Server> getServers() {
        return new ArrayList<Server>(serverService.getServerStorage().values());
    }

    @POST
    @Timed
    public Server addServer(Server server) {
        return serverService.addServer(server);
    }

    @GET
    @Path("/{id}")
    @Timed
    public Server getServer(@PathParam("id") Long id) {
        final Optional<Server> server = serverService.getServer(id);

        if (server.isPresent()) {
            return server.get();
        } else {
            throw new WebApplicationException("Could't find server", Response.Status.NOT_FOUND);
        }
    }

    @DELETE
    @Path("/{id}")
    @Timed
    public Response deleteServer(@PathParam("id") Long id) {
        final Boolean deleted = serverService.deleteServer(id);

        if (deleted) {
            return Response.ok().build();
        } else {
            throw new WebApplicationException("Could't find server", Response.Status.NOT_FOUND);
        }
    }
}
