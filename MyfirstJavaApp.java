public class MyfirstJavaApp {


    public static void main(String[] args) {
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;


        short Power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 2345234523452345L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 1.5;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'g';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + "Km");
        System.out.println("The car is Damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + "Kw(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + "g/Km");
        System.out.println("Emission sticker" + emissionSticker + "(Energy efficiency category: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100Km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100Km");
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100Km");
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPreciseAverage + "l/100Km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);


        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("New value of number of seats: " + newNumberOfSeats);

        int newMileage = mileage;
        System.out.println("New value of mileage: " + newMileage);






    }


}
