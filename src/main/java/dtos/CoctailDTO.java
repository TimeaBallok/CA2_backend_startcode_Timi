package dtos;

import entities.Coctail;

public class CoctailDTO
{
//    String idDrink;
    int id;
    String strDrink;
    String strCategory;
    String strAlcoholic;
    String strInstructions;
    String strDrinkThumb;
    String strIngredient1;
    String strIngredient2;
    String strIngredient3;
    String strIngredient4;
    String strIngredient5;
    String strIngredient6;
    String strIngredient7;
    String strIngredient8;
    String strIngredient9;
    String strIngredient10;
    String strIngredient11;
    String strIngredient12;
    String strIngredient13;
    String strIngredient14;
    String strIngredient15;
    String strMeasure1;
    String strMeasure2;
    String strMeasure3;
    String strMeasure4;
    String strMeasure5;
    String strMeasure6;
    String strMeasure7;
    String strMeasure8;
    String strMeasure9;
    String strMeasure10;
    String strMeasure11;
    String strMeasure12;
    String strMeasure13;
    String strMeasure14;
    String strMeasure15;
    String strImageSource;

    public CoctailDTO(String strDrink, String strCategory, String strAlcoholic, String strInstructions, String strDrinkThumb, String strIngredient1, String strIngredient2, String strIngredient3, String strIngredient4, String strIngredient5, String strIngredient6, String strIngredient7, String strIngredient8, String strIngredient9, String strIngredient10, String strIngredient11, String strIngredient12, String strIngredient13, String strIngredient14, String strIngredient15, String strMeasure1, String strMeasure2, String strMeasure3, String strMeasure4, String strMeasure5, String strMeasure6, String strMeasure7, String strMeasure8, String strMeasure9, String strMeasure10, String strMeasure11, String strMeasure12, String strMeasure13, String strMeasure14, String strMeasure15, String strImageSource)
    {
        this.strDrink = strDrink;
        this.strCategory = strCategory;
        this.strAlcoholic = strAlcoholic;
        this.strInstructions = strInstructions;
        this.strDrinkThumb = strDrinkThumb;
        this.strIngredient1 = strIngredient1;
        this.strIngredient2 = strIngredient2;
        this.strIngredient3 = strIngredient3;
        this.strIngredient4 = strIngredient4;
        this.strIngredient5 = strIngredient5;
        this.strIngredient6 = strIngredient6;
        this.strIngredient7 = strIngredient7;
        this.strIngredient8 = strIngredient8;
        this.strIngredient9 = strIngredient9;
        this.strIngredient10 = strIngredient10;
        this.strIngredient11 = strIngredient11;
        this.strIngredient12 = strIngredient12;
        this.strIngredient13 = strIngredient13;
        this.strIngredient14 = strIngredient14;
        this.strIngredient15 = strIngredient15;
        this.strMeasure1 = strMeasure1;
        this.strMeasure2 = strMeasure2;
        this.strMeasure3 = strMeasure3;
        this.strMeasure4 = strMeasure4;
        this.strMeasure5 = strMeasure5;
        this.strMeasure6 = strMeasure6;
        this.strMeasure7 = strMeasure7;
        this.strMeasure8 = strMeasure8;
        this.strMeasure9 = strMeasure9;
        this.strMeasure10 = strMeasure10;
        this.strMeasure11 = strMeasure11;
        this.strMeasure12 = strMeasure12;
        this.strMeasure13 = strMeasure13;
        this.strMeasure14 = strMeasure14;
        this.strMeasure15 = strMeasure15;
        this.strImageSource = strImageSource;
    }

    public CoctailDTO(Coctail coctail)
    {
        this.id = coctail.getId();
        this.strDrink = coctail.getStrDrink();
        this.strCategory = coctail.getStrCategory();
        this.strAlcoholic = coctail.getStrAlcoholic();
        this.strInstructions = coctail.getStrInstructions();
        this.strDrinkThumb = coctail.getStrDrinkThumb();
        this.strIngredient1 = coctail.getStrIngredient1();
        this.strIngredient2 = coctail.getStrIngredient2();
        this.strIngredient3 = coctail.getStrIngredient3();
        this.strIngredient4 = coctail.getStrIngredient4();
        this.strIngredient5 = coctail.getStrIngredient5();
        this.strIngredient6 = coctail.getStrIngredient6();
        this.strIngredient7 = coctail.getStrIngredient7();
        this.strIngredient8 = coctail.getStrIngredient8();
        this.strIngredient9 = coctail.getStrIngredient9();
        this.strIngredient10 = coctail.getStrIngredient10();
        this.strIngredient11 = coctail.getStrIngredient11();
        this.strIngredient12 = coctail.getStrIngredient12();
        this.strIngredient13 = coctail.getStrIngredient13();
        this.strIngredient14 = coctail.getStrIngredient14();
        this.strIngredient15 = coctail.getStrIngredient15();
        this.strMeasure1 = coctail.getStrMeasure1();
        this.strMeasure2 = coctail.getStrMeasure2();
        this.strMeasure3 = coctail.getStrMeasure3();
        this.strMeasure4 = coctail.getStrMeasure4();
        this.strMeasure5 = coctail.getStrMeasure5();
        this.strMeasure6 = coctail.getStrMeasure6();
        this.strMeasure7 = coctail.getStrMeasure7();
        this.strMeasure8 = coctail.getStrMeasure8();
        this.strMeasure9 = coctail.getStrMeasure9();
        this.strMeasure10 = coctail.getStrMeasure10();
        this.strMeasure11 = coctail.getStrMeasure11();
        this.strMeasure12 = coctail.getStrMeasure12();
        this.strMeasure13 = coctail.getStrMeasure13();
        this.strMeasure14 = coctail.getStrMeasure14();
        this.strMeasure15 = coctail.getStrMeasure15();
        this.strImageSource = coctail.getStrImageSource();
    }
}
