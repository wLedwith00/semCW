import world.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class coursework {
    public static void main(String[] args) {

        }

    public CountryRecord getCountry(int Code)

    {

        try

        {

            //SQL Statement

            Statement stmt = con.createStatement();

            String strSelect = "SELECT Code, Name, Continent, Region, SurfaceArea, IndepYear, Population, LifeExpectacy, GNP, GNPOLd, LocalName, GovernmentForm, HeadOfState, Capital, Code2 "

                            + "FROM Country "

                            + "ORDERBY Population DESC;

            // Runs the Statement

            ResultSet rset = stmt.executeQuery(strSelect);

            // Brings the country/countries found to the screen

            // Check if a country can be found

            if (rset.next())

            {

                CountryRecord cou = new CountryRecord();

                cou.Code = rset.getInt("Code");

                cou.Name = rset.getString("Name");

                cou.Continent = rset.getString("Continent");

                cou.Region = rset.getString("Region");

                cou.SurfaceArea = rset.getString("SurfaceArea");

                cou.IndepYear = rset.getString("IndepYear");

                cou.Population = rset.getString("Population");

                cou.LifeExpectacy = rset.getString("LifeExpectacy");

                cou.GNP = rset.getString("GNP");

                cou.GNPOLd = rset.getString("GNPOLd");

                cou.LocalName = rset.getString("LocalName");

                cou.GovernmentForm = rset.getString("GovernmentForm");

                cou.HeadOfState = rset.getString("HeadOfState");

                cou.Capital = rset.getString("Capital");

                cou.Code2 = rset.getString("Code2");

                return cou;

            }

            else

                //If one can't be found return nothing

                return null;

        }

        //Throws a message if a error is found

        catch (Exception e)

        {

            System.out.println(e.getMessage());

            System.out.println("Failed to get Country details");

            return null;

        }

       //if cou is not blank then it will bring all the information to the screen in one line for each country

        if (cou != null)
        {
            System.out.println(
                    Cou.Code + " "
                            + cou.Name + " "
                            + cou.Continent + " "
                            + cou.Region + " "
                            + cou.SurfaceArea + " "
                    + cou.IndepYear + " "
                    + "Manager: " + cou.Population+ " " + cou.LifeExpectacy + " " + cou.GNP + " " + GNPOld + " " + LocalName + " " + GovernmentForm + " " + cou.HeadOfState + " " cou.capital + " " + cou.Code2);
        }

    }
}