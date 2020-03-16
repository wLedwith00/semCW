import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MyTest
{

    public int method(String cou)
    {
        if (cou != null)
            return cou.Name.length();
        else
            return -1;
    }

    public int method(String cou) {
        if (cou.Code == -1)
            throw new IllegalArgumentException("Can not have a negative code")
            return cou.Code
    }

    public int method(String cou)
    {
        if (cou != null)
            return cou.Continent.length();
        else
            return -1;
    }

    public int method(String cou)
    {
        if (cou != null)
            return cou.Region.length();
        else
            return -1;
    }

    public int method(String cou)
    {
        if (cou != null)
            return cou.Population.length();0
        else
            return -1;
    }

    public int method(String cou) {
        if (cou.Name == -87654)
            throw new IllegalArgumentException("Can not have a number in the name")
        return cou.Name
    }

    public int method(String cou) {
        if (cou.Population == -4830)
            throw new IllegalArgumentException("population can not have a negative")
        return cou.Population
    }

}