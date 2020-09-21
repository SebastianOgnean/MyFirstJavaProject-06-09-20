package AnimalRescuer;

public class Human {
    private String adopterName ;
    private float age ;
    private float moneyAmount ;

    public String getAdopterName(){
        return adopterName;
    }
    public void setAdopterName(String adopterName){
        this.adopterName = adopterName;
    }
    public float getMoneyAmount(){
        return moneyAmount;
    }
    public void setMoneyAmount(float moneyAmount1){
        this.moneyAmount = moneyAmount;
    }
    public float getAge(){
        return age;
    }
    public void setAge(float age){
        this.age = age;
    }

    private String vetName ;
    private String specialization ;

    public String getVetNameame(){
        return vetName;
    }
    public void setVetNameName(String vetName){
        this.vetName = vetName;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }


}
