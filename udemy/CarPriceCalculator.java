package com.java.learn.udemy;
import java.time.LocalDate;

public class CarPriceCalculator {

    public double getSalePrice(String makeAndModel, int yearManufactured, double milesDriven,
                               int airBagsCount, boolean hasAbs, boolean hasEbd,
                               boolean hasRearViewCamera, boolean hasSunRoof, boolean hasAutoAC,
                               boolean hasAccidentHistory) {

        double salePrice = getCurrentPrice(makeAndModel);
        int currentYear = LocalDate.now().getYear();
        int ageOfCar = currentYear - yearManufactured + 1;
        System.out.println("ageOfCar: " + ageOfCar);

        if (ageOfCar <= 10) {
            double depriciationValue = salePrice * 0.2 + ((ageOfCar - 1)* salePrice *0.15);
            salePrice = salePrice - depriciationValue;
        } else
            salePrice *= 0.1;
        // 1. Compute based on yearly depreciation value:
        //       if age of car is less than or equal to 10 then
        //               price depreciates by 20% in 1st year and there after depreciates by 15% each following year
        //       else
        //               price would be 10% of the current price, i.e., salePrice * 0.1
        // Note: Use compound arithmetic assignment operators


        System.out.println("salePrice after depreciation: " + salePrice);


        // 2. Security Features
        //      if car has atleast two airbags AND abs AND ebd
        //               then increment price by $500 times the number of air bags
        //      else
        //               reduce price by $3000

        if (airBagsCount >= 2 &&   (hasAbs == true) && (hasEbd == true))
        {
            salePrice=salePrice+(airBagsCount*500);
        }
        else
            salePrice-=3000;


        System.out.println("salePrice after accounting for security features: " + salePrice);

        // 3. Comfort Features
        // if car has rear-view camera AND either sunroof OR auto AC then
        //    increment price by $500

        if (hasRearViewCamera==true && (hasSunRoof==true||hasAutoAC == true))
        {
            salePrice+=500;
        }


        System.out.println("salePrice after accounting for comfort features: " + salePrice);

        // 4. Past accidents
        // if car was involved in a car accident then
        //     reduce the price by $3000

        if (hasAccidentHistory==true)
        {
            salePrice-=3000;
        }

        System.out.println("salePrice after accounting for past accidents: " + salePrice);

        // 5. Based additional miles driven
        double expectedMilesDriven = ageOfCar * 10000.0;
        double additionalMiles = milesDriven - expectedMilesDriven;

        // a) if # miles overdriven by car is greater than 1000 AND less than or equal to 10000 then
        //        reduce sale price by 500


        if (additionalMiles>1000&& additionalMiles<=10000)

            salePrice-=500;

        else if (additionalMiles>10000 && additionalMiles<=30000)

            salePrice-=2000;
        else if (additionalMiles>3000)
            salePrice-=3000;


        // b) if # miles overdriven by car is greater than 10000 AND less than or equal to 30000 then
        //        reduce sale price by 2000


        // c) if # miles overdriven by car is greater than 30000 then
        //        reduce sale price by 3000


        System.out.println("salePrice after accounting for miles driven: " + salePrice);

        return salePrice;
    }

    private double getCurrentPrice(String makeAndModel) {
        if (makeAndModel.equalsIgnoreCase("ford ecosport")) {
            return 20000.0;
        } else if (makeAndModel.equalsIgnoreCase("honda city")) {
            return 25000.0;
        } else if (makeAndModel.equalsIgnoreCase("toyota camry hybrid")) {
            return 30000.0;
        }
        return 20000.0;
    }

    public static void main(String[] args) {
        CarPriceCalculator carPriceCalculator = new CarPriceCalculator();
        double salesPrice = carPriceCalculator.getSalePrice("ford ecosport", 2018, 15000.0, 2, true, true, true, false, true, false);
    }
}
