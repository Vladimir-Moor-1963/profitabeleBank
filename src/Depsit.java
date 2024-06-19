public class Depsit {



    private int investor ;

    private double persent;

   private int years;
    private int money;


    public String toString() {
        return "Depsit{" +
                "investor=" + investor +
                ", persent=" + persent +
                ", years=" + years +
                ", money=" + money +
                '}';
    }

    public Depsit(int investor, double persent, int years, int money) {
        this.investor = investor;
        this.persent = persent;
        this.years = years;
        this.money = money;

    }

    public int getInvestor() {
        return investor;
    }

    public void setInvestor(int investor) {
        this.investor = investor;
    }

    public double getPersent() {
        return persent;
    }

    public void setPersent(double persent) {
        this.persent = persent;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
