package fr.paris.lutece.portal.rest;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/user")
public class Controller {

    @GET
    @Path("/test")
    public String get() {
return "cfefzefze";
    }


}