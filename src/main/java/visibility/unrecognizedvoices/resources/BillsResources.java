package visibility.unrecognizedvoices.resources;

import com.codahale.metrics.annotation.Timed;
import visibility.unrecognizedvoices.core.*;
import visibility.unrecognizedvoices.db.daos.*;
import visibility.unrecognizedvoices.db.services.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Optional;

@Path("/bills")
@Produces(MediaType.APPLICATION_JSON)
public class BillsResources {

    private final BillService billService;

    public BillsResources(BillService billService) {
        this.billService = billService;
    }

    @GET
    @Timed
    public ArrayList<Bill> getBills(@QueryParam("page") @DefaultValue("1") Optional<Integer> page,
                                    @QueryParam("pageSize") @DefaultValue("10") Optional<Integer> pageSize) {
        System.out.println("Entering 'getBills");
        ArrayList<Bill> bills = new ArrayList<>();
        bills.add(new Bill());
        return bills;
    }

    @GET
    @Timed
    @Path("/house")
    public ArrayList<Bill> getBillsHouse(@QueryParam("page") @DefaultValue("1") Optional<Integer> page,
                                         @QueryParam("pageSize") @DefaultValue("10") Optional<Integer> pageSize) {
        System.out.println("Entering 'getBillsHouse");
        ArrayList<Bill> bills = new ArrayList<>();
        bills.add(new Bill());
        return bills;
    }

    @GET
    @Timed
    @Path("/senate")
    public ArrayList<Bill> getBillsSenate(@QueryParam("page") @DefaultValue("1") Optional<Integer> page,
                                          @QueryParam("pageSize") @DefaultValue("10") Optional<Integer> pageSize) {
        System.out.println("Entering 'getBillsSenate");
        ArrayList<Bill> bills = new ArrayList<>();
        bills.add(new Bill());
        return bills;
    }


    @GET
    @Timed
    @Path("/{uniqueId}")
    public Bill getBill(@PathParam("uniqueId") int uniqueId) {
        System.out.println("Entering 'getBill");
        return new Bill();
    }
}
