package api.servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hai")
public class Hai {
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String processAllGet() {
	    return "{\n \t 'greeting' : 'hello' \n}";
	  }	
}
