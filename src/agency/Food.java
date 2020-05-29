package agency;

/**
 * Created by aser on 2020/5/27
 */
class Food {

    public String Chicken;
    public String Spicy;
    public String Salt;
    public String Noodle;
    public String Condiment;

    public  void AddCondiment(String condiment){
        Condiment=condiment;
    }
    public String getCondiment() {
        return Condiment;
    }

    public void setCondiment(String condiment) {
        Condiment = condiment;
    }

    public String getNoodle() {
        return Noodle;
    }

    public void setNoodle(String noodle) {
        Noodle = noodle;
    }

    public String getChicken() {
        return Chicken;
    }

    public void setChicken(String chicken) {
        Chicken = chicken;
    }

    public String getSpicy() {
        return Spicy;
    }

    public void setSpicy(String spicy) {
        Spicy = spicy;
    }

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String salt) {
        Salt = salt;
    }
}
