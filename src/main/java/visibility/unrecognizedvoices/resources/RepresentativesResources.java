package visibility.unrecognizedvoices.resources;

import com.codahale.metrics.annotation.Timed;
import visibility.unrecognizedvoices.core.*;
import visibility.unrecognizedvoices.db.services.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by benjaminpurdy on 5/21/17.
 */
@Path("/representatives")
@Produces(MediaType.APPLICATION_JSON)
public class RepresentativesResources {

    private final RepresentativeService representativeService;

    public RepresentativesResources(RepresentativeService representativeService) {
        this.representativeService = representativeService;
    }

    @GET
    @Timed
    public ArrayList<Representative> getRepresentatives(@QueryParam("page") @DefaultValue("1") Optional<Integer> page,
                                                        @QueryParam("pageSize") @DefaultValue("10") Optional<Integer> pageSize) {
        System.out.println("Entering getRepresentatives");
        ArrayList<Representative> representatives = new ArrayList<>();
        representatives.add(new Representative());
        return representatives;
    }

    @GET
    @Timed
    @Path("/house")
    public ArrayList<Representative> getRepresentativesHouse(@QueryParam("page") @DefaultValue("1") Optional<Integer> page,
                                                             @QueryParam("pageSize") @DefaultValue("10") Optional<Integer> pageSize) {
        System.out.println("Entering getRepresentativesHouse");
        ArrayList<Representative> representatives = new ArrayList<>();
        representatives.add(new Representative());
        return representatives;
    }

    @GET
    @Timed
    @Path("/senate")
    public ArrayList<Representative> getRepresentativesSenate(@QueryParam("page") @DefaultValue("1") Optional<Integer> page,
                                                              @QueryParam("pageSize") @DefaultValue("10") Optional<Integer> pageSize) {
        System.out.println("Entering getRepresentativesSenate: page[" + page.get() + "]");
        ArrayList<Representative> representatives = new ArrayList<>();
        representatives.add(new Representative());
        return representatives;
    }

    @GET
    @Timed
    @Path("/{uniqueId}")
    public Representative getRepresentative(@PathParam("uniqueId") int uniqueId) {
        System.out.println("Entering getRepresentative");
        return new Representative();
    }
}
