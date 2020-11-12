public class AfricanHen extends Hen{
    @Override
    public int getMonthlyEggCount() {
        return 16;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" I come from "+Continent.AFRICA+". I lay "+getMonthlyEggCount()+ " eggs a month.";
    }

}
