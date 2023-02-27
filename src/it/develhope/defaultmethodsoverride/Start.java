package it.develhope.defaultmethodsoverride;
public class Start {
    public static void main(String[] args)
    {
        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 500.00);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 550.00);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 700.00);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 750.00);
        Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S21", 5000, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Apple", "iPhone 12", 4000, producerPrice2, retailPrice2);
        System.out.println(smartphone1.toString());
        System.out.println(smartphone2.toString());
        if (smartphone1.equals(smartphone2))
        {
            System.out.println("The two smartphones are equal.");
        }
        else
        {
            System.out.println("The two smartphones are different.");
        }
        try
        {
            Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();
            System.out.println(clonedSmartphone.toString());
            if (smartphone2.equals(clonedSmartphone))
            {
                System.out.println("The original and the cloned smartphones are equal.");
            }
            else
            {
                System.out.println("The original and the cloned smartphones are different.");
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
