public class NorthAmericanHen extends Hen{
    @Override
    public int getMonthlyEggCount() {

        return 8;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " I come from "+Continent.NORTHAMERICA+". I lay "+ getMonthlyEggCount()+ " eggs a month.";
    }

}
