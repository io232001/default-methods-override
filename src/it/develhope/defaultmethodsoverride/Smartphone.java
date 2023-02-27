package it.develhope.defaultmethodsoverride;
import java.util.Objects;
class Smartphone implements Cloneable
{
        private String brandName;
        private String modelName;
        private int batteryMah;
        private SmartphonePrice producerPrice;
        private SmartphonePrice retailPrice;
        public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP)
        {
            this.brandName = brand;
            this.modelName = model;
            this.batteryMah = battery;
            this.producerPrice = prodP;
            this.retailPrice = retailP;
        }
        @Override
        public String toString()
        {
            return "Smartphone{" +
                    "brandName='" + brandName + '\'' +
                    ", modelName='" + modelName + '\'' +
                    ", batteryMah=" + batteryMah +
                    ", producerPrice=" + producerPrice +
                    ", retailPrice=" + retailPrice +
                    '}';
        }
        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Smartphone that = (Smartphone) o;
            return batteryMah == that.batteryMah && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
        }
        @Override
        public int hashCode() {
            return Objects.hash(brandName, modelName, batteryMah, producerPrice, retailPrice);
        }
        @Override
        public Smartphone clone() {
            Smartphone clonedSmartphone = null;
            try {
                clonedSmartphone = (Smartphone) super.clone();
                clonedSmartphone.producerPrice = producerPrice.clone();
                clonedSmartphone.retailPrice = retailPrice.clone();
            }
            catch (CloneNotSupportedException e)
            {
                e.printStackTrace();
            }
            return clonedSmartphone;
        }
}

