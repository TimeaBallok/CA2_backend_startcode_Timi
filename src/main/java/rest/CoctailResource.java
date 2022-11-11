package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.CoctailsDTO;
import facades.CoctailFacade;
import facades.FacadeExample;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/coctail")
public class CoctailResource
{
    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

    private static final CoctailFacade FACADE =  CoctailFacade.getInstance(EMF);
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
        String coctailJSON = FACADE.fetchCoctails(URL);
        CoctailsDTO coctailsDTO = GSON.fromJson(coctailJSON, CoctailsDTO.class);
        return GSON.toJson(coctailsDTO);
    }

}

