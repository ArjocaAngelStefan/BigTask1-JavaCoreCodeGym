public class EuropeanHen extends Hen{
    @Override
    public int getMonthlyEggCount() {

        return 19;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " I come from "+Continent.EUROPE+". I lay "+ getMonthlyEggCount()+ " eggs a month.";
    }
}
