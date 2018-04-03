package City.resources;

import City.db.MySQL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/posta")
public class City {

    @GET
    @Path("/obec/{nazovobce}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPSC(@PathParam("nazovobce")String nazovobce){

        String psc = new MySQL().getPSC(nazovobce);
        String result = "{\"Obec\":\""+psc+"\"}";
        return result;
    }

    @GET
    @Path("/psc/{psc}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getObec(@PathParam("psc") String psc) {

        String obec = new MySQL().getObec(psc);
        String result = "{\"psc\":\""+obec+"\"}";
        return result;
    }

}
