public class AsianHen extends Hen{
    @Override
    public int getMonthlyEggCount() {

        return 12;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " I come from Asia. I lay "+ getMonthlyEggCount()+ " eggs a month.";
    }
}
