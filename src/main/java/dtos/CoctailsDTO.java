package dtos;

import java.util.ArrayList;
import java.util.List;

public class CoctailsDTO
{
    List<CoctailDTO> drinks;

    public CoctailsDTO(List<CoctailDTO> drinks)
    {
        this.drinks = drinks;
    }

    public List<CoctailDTO> getDrinks()
    {
        return drinks;
    }

    public void setDrinks(List<CoctailDTO> drinks)
    {
        this.drinks = drinks;
    }
}
