package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.CoctailDTO;
import dtos.CoctailsDTO;
import facades.CoctailFacade;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Path("/coctail")
public class CoctailResource
{
    CoctailFacade cf = new CoctailFacade();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"Hello, coctail World!\"}";
    }

    @Path("getCoctail")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getCoctail() throws IOException
    {
        String URL = "https://www.thecocktaildb.com/api/json/v1/1/random.php";
        String coctailJSON = cf.fetchCoctails(URL);
        CoctailsDTO coctailsDTO = GSON.fromJson(coctailJSON, CoctailsDTO.class);
        return GSON.toJson(coctailsDTO);
    }

}

