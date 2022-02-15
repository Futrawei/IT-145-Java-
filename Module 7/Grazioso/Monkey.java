/*
Author: Travis Barbur
Course: IT-145 - X3993
Date: 02/15/2022
 */
public class Monkey extends RescueAnimal {
    // Instance variables
    private String Species;
    // Input validation implemented
    public final static String[] input_validation = {
            "Capuchin",
            "Guenon",
            "Macaque",
            "Marmoset",
            "Squirrel Monkey",
            "Tamarin"
    };



    // Constructor
    public Monkey(
            String name, String Species, String height, String tailLength, String bodyLength, String gender, String age,
            String weight, String acquisitionDate, String acquisitionCountry,
            String trainingStatus, boolean reserved, String inServiceCountry
    ) {
        setName(name);
        setBreed(Species);
        setHeight(height);
        setTailLength(tailLength);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    // Accessor methods
    public String getBreed() {
        return Species;
    }
    public String getSpecies() {
        return Species;
    }
    public String getTailLength() {
        return getTailLength();
    }
    public String getBodyLength() {
        return getBodyLength();
    }
    public String getHeight() {
        return getHeight();
    }

    // Mutator methods
    public void setSpecies(String species) {
        Species = species;
    }
    public void setBreed(String monkeyBreed) {
        Species = monkeyBreed;
    }

    public void setHeight(String monkeyHeight) {
        String height = "height";
    }
    public void setTailLength(String monkeyTaillength) {
    }
    public void setBodyLength(String BodyLength) {

    }
}
