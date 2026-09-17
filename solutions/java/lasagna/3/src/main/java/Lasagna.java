public class Lasagna {
    int expectedOvenTime = 40;
    
    public int expectedMinutesInOven(){
        return expectedOvenTime;
    }

    public int remainingMinutesInOven(int minutes){
        return this.expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layers){
        return 2 * layers;
    }

    public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutes) {
        return numberOfMinutes + this.preparationTimeInMinutes(numberOfLayers);
    }
}
