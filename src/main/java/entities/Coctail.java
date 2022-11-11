package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@NamedQuery(name = "Coctail.deleteAllRows", query = "DELETE from Coctail")
@Table(name = "coctail")
public class Coctail
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 45)
    @NotNull
    @Column(name = "drink", nullable = false, length = 45)
    String strDrink;
    @Size(max = 45)
    @NotNull
    @Column(name = "category", nullable = false, length = 45)
    String strCategory;
    @Size(max = 45)
    @NotNull
    @Column(name = "alcoholic", nullable = false, length = 45)
    String strAlcoholic;
    @Size(max = 500)
    @NotNull
    @Column(name = "instructions", nullable = false, length = 500)
    String strInstructions;
    @Size(max = 45)
    @Column(name = "drink_thumb", length = 45)
    String strDrinkThumb;
    @Size(max = 45)
    @Column(name = "ingredient1", length = 45)
    String strIngredient1;
    @Size(max = 45)
    @Column(name = "ingredient2", length = 45)
    String strIngredient2;
    @Size(max = 45)
    @Column(name = "ingredient3", length = 45)
    String strIngredient3;
    @Size(max = 45)
    @Column(name = "ingredient4", length = 45)
    String strIngredient4;
    @Size(max = 45)
    @Column(name = "ingredient5", length = 45)
    String strIngredient5;
    @Size(max = 45)
    @Column(name = "ingredient6", length = 45)
    String strIngredient6;
    @Size(max = 45)
    @Column(name = "ingredient7", length = 45)
    String strIngredient7;
    @Size(max = 45)
    @Column(name = "ingredient8", length = 45)
    String strIngredient8;
    @Size(max = 45)
    @Column(name = "ingredient9", length = 45)
    String strIngredient9;
    @Size(max = 45)
    @Column(name = "ingredient10", length = 45)
    String strIngredient10;
    @Size(max = 45)
    @Column(name = "ingredient11", length = 45)
    String strIngredient11;
    @Size(max = 45)
    @Column(name = "ingredient12", length = 45)
    String strIngredient12;
    @Size(max = 45)
    @Column(name = "ingredient13", length = 45)
    String strIngredient13;
    @Size(max = 45)
    @Column(name = "ingredient14", length = 45)
    String strIngredient14;
    @Size(max = 45)
    @Column(name = "ingredient15", length = 45)
    String strIngredient15;
    @Size(max = 45)
    @Column(name = "measure1", length = 45)
    String strMeasure1;
    @Size(max = 45)
    @Column(name = "measure2", length = 45)
    String strMeasure2;
    @Size(max = 45)
    @Column(name = "measure3", length = 45)
    String strMeasure3;
    @Size(max = 45)
    @Column(name = "measure4", length = 45)
    String strMeasure4;
    @Size(max = 45)
    @Column(name = "measure5", length = 45)
    String strMeasure5;
    @Size(max = 45)
    @Column(name = "measure6", length = 45)
    String strMeasure6;
    @Size(max = 45)
    @Column(name = "measure7", length = 45)
    String strMeasure7;
    @Size(max = 45)
    @Column(name = "measure8", length = 45)
    String strMeasure8;
    @Size(max = 45)
    @Column(name = "measure9", length = 45)
    String strMeasure9;
    @Size(max = 45)
    @Column(name = "measure10", length = 45)
    String strMeasure10;
    @Size(max = 45)
    @Column(name = "measure11", length = 45)
    String strMeasure11;
    @Size(max = 45)
    @Column(name = "measure12", length = 45)
    String strMeasure12;
    @Size(max = 45)
    @Column(name = "measure13", length = 45)
    String strMeasure13;
    @Size(max = 45)
    @Column(name = "measure14", length = 45)
    String strMeasure14;
    @Size(max = 45)
    @Column(name = "measure15", length = 45)
    String strMeasure15;
    @Size(max = 45)
    @Column(name = "img_source", length = 45)
    String strImageSource;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;


    public Coctail()
    {
    }

    public Coctail(Integer id, String strDrink, String strCategory, String strAlcoholic, String strInstructions, String strDrinkThumb, String strIngredient1, String strIngredient2, String strIngredient3, String strIngredient4, String strIngredient5, String strIngredient6, String strIngredient7, String strIngredient8, String strIngredient9, String strIngredient10, String strIngredient11, String strIngredient12, String strIngredient13, String strIngredient14, String strIngredient15, String strMeasure1, String strMeasure2, String strMeasure3, String strMeasure4, String strMeasure5, String strMeasure6, String strMeasure7, String strMeasure8, String strMeasure9, String strMeasure10, String strMeasure11, String strMeasure12, String strMeasure13, String strMeasure14, String strMeasure15, String strImageSource, User user)
    {
        this.id = id;
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
        this.user = user;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getStrDrink()
    {
        return strDrink;
    }

    public void setStrDrink(String strDrink)
    {
        this.strDrink = strDrink;
    }

    public String getStrCategory()
    {
        return strCategory;
    }

    public void setStrCategory(String strCategory)
    {
        this.strCategory = strCategory;
    }

    public String getStrAlcoholic()
    {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic)
    {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrInstructions()
    {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions)
    {
        this.strInstructions = strInstructions;
    }

    public String getStrDrinkThumb()
    {
        return strDrinkThumb;
    }

    public void setStrDrinkThumb(String strDrinkThumb)
    {
        this.strDrinkThumb = strDrinkThumb;
    }

    public String getStrIngredient1()
    {
        return strIngredient1;
    }

    public void setStrIngredient1(String strIngredient1)
    {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrIngredient2()
    {
        return strIngredient2;
    }

    public void setStrIngredient2(String strIngredient2)
    {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3()
    {
        return strIngredient3;
    }

    public void setStrIngredient3(String strIngredient3)
    {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4()
    {
        return strIngredient4;
    }

    public void setStrIngredient4(String strIngredient4)
    {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5()
    {
        return strIngredient5;
    }

    public void setStrIngredient5(String strIngredient5)
    {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrIngredient6()
    {
        return strIngredient6;
    }

    public void setStrIngredient6(String strIngredient6)
    {
        this.strIngredient6 = strIngredient6;
    }

    public String getStrIngredient7()
    {
        return strIngredient7;
    }

    public void setStrIngredient7(String strIngredient7)
    {
        this.strIngredient7 = strIngredient7;
    }

    public String getStrIngredient8()
    {
        return strIngredient8;
    }

    public void setStrIngredient8(String strIngredient8)
    {
        this.strIngredient8 = strIngredient8;
    }

    public String getStrIngredient9()
    {
        return strIngredient9;
    }

    public void setStrIngredient9(String strIngredient9)
    {
        this.strIngredient9 = strIngredient9;
    }

    public String getStrIngredient10()
    {
        return strIngredient10;
    }

    public void setStrIngredient10(String strIngredient10)
    {
        this.strIngredient10 = strIngredient10;
    }

    public String getStrIngredient11()
    {
        return strIngredient11;
    }

    public void setStrIngredient11(String strIngredient11)
    {
        this.strIngredient11 = strIngredient11;
    }

    public String getStrIngredient12()
    {
        return strIngredient12;
    }

    public void setStrIngredient12(String strIngredient12)
    {
        this.strIngredient12 = strIngredient12;
    }

    public String getStrIngredient13()
    {
        return strIngredient13;
    }

    public void setStrIngredient13(String strIngredient13)
    {
        this.strIngredient13 = strIngredient13;
    }

    public String getStrIngredient14()
    {
        return strIngredient14;
    }

    public void setStrIngredient14(String strIngredient14)
    {
        this.strIngredient14 = strIngredient14;
    }

    public String getStrIngredient15()
    {
        return strIngredient15;
    }

    public void setStrIngredient15(String strIngredient15)
    {
        this.strIngredient15 = strIngredient15;
    }

    public String getStrMeasure1()
    {
        return strMeasure1;
    }

    public void setStrMeasure1(String strMeasure1)
    {
        this.strMeasure1 = strMeasure1;
    }

    public String getStrMeasure2()
    {
        return strMeasure2;
    }

    public void setStrMeasure2(String strMeasure2)
    {
        this.strMeasure2 = strMeasure2;
    }

    public String getStrMeasure3()
    {
        return strMeasure3;
    }

    public void setStrMeasure3(String strMeasure3)
    {
        this.strMeasure3 = strMeasure3;
    }

    public String getStrMeasure4()
    {
        return strMeasure4;
    }

    public void setStrMeasure4(String strMeasure4)
    {
        this.strMeasure4 = strMeasure4;
    }

    public String getStrMeasure5()
    {
        return strMeasure5;
    }

    public void setStrMeasure5(String strMeasure5)
    {
        this.strMeasure5 = strMeasure5;
    }

    public String getStrMeasure6()
    {
        return strMeasure6;
    }

    public void setStrMeasure6(String strMeasure6)
    {
        this.strMeasure6 = strMeasure6;
    }

    public String getStrMeasure7()
    {
        return strMeasure7;
    }

    public void setStrMeasure7(String strMeasure7)
    {
        this.strMeasure7 = strMeasure7;
    }

    public String getStrMeasure8()
    {
        return strMeasure8;
    }

    public void setStrMeasure8(String strMeasure8)
    {
        this.strMeasure8 = strMeasure8;
    }

    public String getStrMeasure9()
    {
        return strMeasure9;
    }

    public void setStrMeasure9(String strMeasure9)
    {
        this.strMeasure9 = strMeasure9;
    }

    public String getStrMeasure10()
    {
        return strMeasure10;
    }

    public void setStrMeasure10(String strMeasure10)
    {
        this.strMeasure10 = strMeasure10;
    }

    public String getStrMeasure11()
    {
        return strMeasure11;
    }

    public void setStrMeasure11(String strMeasure11)
    {
        this.strMeasure11 = strMeasure11;
    }

    public String getStrMeasure12()
    {
        return strMeasure12;
    }

    public void setStrMeasure12(String strMeasure12)
    {
        this.strMeasure12 = strMeasure12;
    }

    public String getStrMeasure13()
    {
        return strMeasure13;
    }

    public void setStrMeasure13(String strMeasure13)
    {
        this.strMeasure13 = strMeasure13;
    }

    public String getStrMeasure14()
    {
        return strMeasure14;
    }

    public void setStrMeasure14(String strMeasure14)
    {
        this.strMeasure14 = strMeasure14;
    }

    public String getStrMeasure15()
    {
        return strMeasure15;
    }

    public void setStrMeasure15(String strMeasure15)
    {
        this.strMeasure15 = strMeasure15;
    }

    public String getStrImageSource()
    {
        return strImageSource;
    }

    public void setStrImageSource(String strImageSource)
    {
        this.strImageSource = strImageSource;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(Coctail coctail)
    {
        this.user = user;
    }

    @Override
    public String toString()
    {
        return "Coctail{" +
                "id=" + id +
                ", strDrink='" + strDrink + '\'' +
                ", strCategory='" + strCategory + '\'' +
                ", strAlcoholic='" + strAlcoholic + '\'' +
                ", strInstructions='" + strInstructions + '\'' +
                ", strDrinkThumb='" + strDrinkThumb + '\'' +
                ", strIngredient1='" + strIngredient1 + '\'' +
                ", strIngredient2='" + strIngredient2 + '\'' +
                ", strIngredient3='" + strIngredient3 + '\'' +
                ", strIngredient4='" + strIngredient4 + '\'' +
                ", strIngredient5='" + strIngredient5 + '\'' +
                ", strIngredient6='" + strIngredient6 + '\'' +
                ", strIngredient7='" + strIngredient7 + '\'' +
                ", strIngredient8='" + strIngredient8 + '\'' +
                ", strIngredient9='" + strIngredient9 + '\'' +
                ", strIngredient10='" + strIngredient10 + '\'' +
                ", strIngredient11='" + strIngredient11 + '\'' +
                ", strIngredient12='" + strIngredient12 + '\'' +
                ", strIngredient13='" + strIngredient13 + '\'' +
                ", strIngredient14='" + strIngredient14 + '\'' +
                ", strIngredient15='" + strIngredient15 + '\'' +
                ", strMeasure1='" + strMeasure1 + '\'' +
                ", strMeasure2='" + strMeasure2 + '\'' +
                ", strMeasure3='" + strMeasure3 + '\'' +
                ", strMeasure4='" + strMeasure4 + '\'' +
                ", strMeasure5='" + strMeasure5 + '\'' +
                ", strMeasure6='" + strMeasure6 + '\'' +
                ", strMeasure7='" + strMeasure7 + '\'' +
                ", strMeasure8='" + strMeasure8 + '\'' +
                ", strMeasure9='" + strMeasure9 + '\'' +
                ", strMeasure10='" + strMeasure10 + '\'' +
                ", strMeasure11='" + strMeasure11 + '\'' +
                ", strMeasure12='" + strMeasure12 + '\'' +
                ", strMeasure13='" + strMeasure13 + '\'' +
                ", strMeasure14='" + strMeasure14 + '\'' +
                ", strMeasure15='" + strMeasure15 + '\'' +
                ", strImageSource='" + strImageSource + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coctail coctail = (Coctail) o;
        return Objects.equals(id, coctail.id) && Objects.equals(strDrink, coctail.strDrink);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, strDrink);
    }
}