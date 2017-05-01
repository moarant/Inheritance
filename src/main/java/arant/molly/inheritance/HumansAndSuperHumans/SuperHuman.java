package arant.molly.inheritance.HumansAndSuperHumans;

/**
 * Created by mollyarant on 5/1/17.
 */
public class SuperHuman extends Human {
    boolean isGood;
    String heroName;
    String superAbility;

    public SuperHuman(String name, int age, boolean isFemale, String occupation, String address, boolean isGood, String heroName, String superPower) {
        super(name, age, isFemale, occupation, address);
        this.isGood= isGood;
        this.heroName= heroName;
        this.superAbility= superPower;
    }


    public boolean getIsGood() {
        return this.isGood;
    }


    public void setIsGood(boolean isGood) {
        this.isGood= isGood;
    }


    public String getHeroName() {
        return this.heroName;
    }


    public void setHeroName(String heroName) {
        this.heroName= heroName;
    }


    public String getSuperAbility() {
        return this.superAbility;
    }


    public void setSuperAbility(String superAbility) {
        this.superAbility= superAbility;
    }

    @Override
    public String toString(){
        return this.name + ", Superhero identity: "+ this.heroName +  this.age + ", female: " + this.isFemale + ", " + this.occupation+ ", " + this.address + ", Good? " + this.isGood +", "+ this.superAbility;
    }



}
