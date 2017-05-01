package arant.molly.inheritance.HumansAndSuperHumans;


public class Human {
    String name;
    int age;
    boolean isFemale;
    String occupation;
    String address;

    public Human (String name, int age, boolean isFemale, String occupation, String address) {
        this.name = name;
        this.isFemale = isFemale;
        this.occupation = occupation;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name= name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(){
        this.age= age;
    }


    public boolean getisFemale() {
        return this.isFemale;
    }


    public void setisFemale(boolean female) {
        this.isFemale= female;
    }


    public String getOccupation() {
        return this.occupation;
    }


    public void setOccupation(String job) {
        this.occupation= job;
    }


    public String getAddress() {
        return this.address;
    }


    public void setAddress(String address) {
        this.address= address;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.age + ", female: " + this.isFemale + ", " + this.occupation+ ", " + this.address;
    }





}

