package de.erdlet.example.mvc;

import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class ExampleController {

  @GET
  @Controller
  public String index() {
    return "index.jsp";
  }
}
