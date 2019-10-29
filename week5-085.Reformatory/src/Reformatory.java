public class Reformatory {
    private int totalWeightsCount = 0;
    public int weight(Person person) {
        // return the weight of the person
        this.totalWeightsCount++;
        return person.getWeight();
    }
    public void feed(Person person){
        person.setWeight(weight(person)+1);
    }
    public int totalWeightsMeasured(){
        return totalWeightsCount;
    }
}
