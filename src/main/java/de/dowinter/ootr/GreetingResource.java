package de.dowinter.ootr;

import static java.util.stream.Collectors.groupingBy;

import de.dowinter.ootr.jna.pointers.objectives.Skulltula;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@RequestScoped
public class GreetingResource {

    @Inject
    List<Skulltula> skulltulaChecks;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {

        return Response.ok(skulltulaChecks.stream().collect(groupingBy(s -> s.isDone()))).build();
    }
}
