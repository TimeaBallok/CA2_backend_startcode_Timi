package facades;

import dtos.CoctailDTO;
import entities.Coctail;
import entities.User;

import javax.enterprise.inject.Typed;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.ws.rs.WebApplicationException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class CoctailFacade
{
    private static CoctailFacade instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private CoctailFacade() {}

    public static CoctailFacade getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new CoctailFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public String fetchCoctails (String url) throws IOException
    {
        URL apiURL = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiURL.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("User-Agent", "server");

        Scanner scan = new Scanner(connection.getInputStream());
        String jsonStr = null;
        if (scan.hasNext()) {
            jsonStr = scan.nextLine();
        }
        scan.close();
        return jsonStr;
    }

    public List<CoctailDTO> getAllCoctailsByUser(String userName)
    {
        EntityManager em = getEntityManager();
        try
        {
            TypedQuery<Coctail> query = em.createQuery("select c from Coctail c join c.user u where u.userName = :userName", Coctail.class);
            query.setParameter("userName", userName);
            List<Coctail> coctails = query.getResultList();
            return CoctailDTO.getCoctailDTOList(coctails);
        }
        finally
        {
            em.close();
        }
    }

    public long countCoctailsPerUser(String userName)
    {
        EntityManager em = getEntityManager();
        long count;
        TypedQuery<Integer> query = em.createQuery("select c from Coctail c join c.user u where u.userName = :userName", Integer.class);
        query.setParameter("userName", userName);
        count = query.getResultList().size();
        em.close();
        return count;
    }

    public User addCoctail(CoctailDTO coctailDTO)
    {
        EntityManager em = getEntityManager();
        try
        {
            User user = em.find(User.class, coctailDTO.getUserName());
            if (user == null)
                throw new WebApplicationException("User doesn't exist with username: " + coctailDTO.getUserName());
            em.getTransaction().begin();
            Coctail coctail = new Coctail(coctailDTO.getId(), coctailDTO.getStrDrink(), coctailDTO.getStrCategory(),
                    coctailDTO.getStrAlcoholic(), coctailDTO.getStrInstructions(), coctailDTO.getStrDrinkThumb(),
                    coctailDTO.getStrIngredient1(), coctailDTO.getStrIngredient2(), coctailDTO.getStrIngredient3(),
                    coctailDTO.getStrIngredient4(), coctailDTO.getStrIngredient5(), coctailDTO.getStrIngredient6(),
                    coctailDTO.getStrIngredient7(), coctailDTO.getStrIngredient8(), coctailDTO.getStrIngredient9(),
                    coctailDTO.getStrIngredient10(), coctailDTO.getStrIngredient11(), coctailDTO.getStrIngredient12(),
                    coctailDTO.getStrIngredient13(), coctailDTO.getStrIngredient14(), coctailDTO.getStrIngredient15(),
                    coctailDTO.getStrMeasure1(), coctailDTO.getStrMeasure2(), coctailDTO.getStrMeasure3(),
                    coctailDTO.getStrMeasure4(), coctailDTO.getStrMeasure5(), coctailDTO.getStrMeasure6(),
                    coctailDTO.getStrMeasure7(), coctailDTO.getStrMeasure8(), coctailDTO.getStrMeasure9(),
                    coctailDTO.getStrMeasure10(), coctailDTO.getStrMeasure11(), coctailDTO.getStrMeasure12(),
                    coctailDTO.getStrMeasure13(), coctailDTO.getStrMeasure14(), coctailDTO.getStrMeasure15(),
                    coctailDTO.getStrImageSource());
            em.persist(coctail);
            user.addCoctail(coctail);
            em.getTransaction().commit();
            return user;
        }
        finally
        {
            em.close();
        }
    }



}
