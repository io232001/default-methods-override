package it.develhope.defaultmethodsoverride;
import java.util.Objects;
public class SmartphonePrice implements Cloneable
{
    private String priceType;
    private double priceInEuros;
    public SmartphonePrice(String type, double price)
    {
        this.priceType = type;
        this.priceInEuros = price;
    }
    @Override
    public SmartphonePrice clone()
    {
        SmartphonePrice clonedSmartphonePrice = null;
        try
        {
            clonedSmartphonePrice = (SmartphonePrice) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clonedSmartphonePrice;
    }
    @Override
    public String toString()
    {
        return "SmartphonePrice{" + "priceType='" + priceType + '\'' + ", priceInEuros=" + priceInEuros + '}';
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(priceType, priceInEuros);
    }
}
