public class Solution {
    public static void main(String[] args) {


        Hen hen = HenFactory.getHen(Continent.AFRICA);
        //Hen hen1 = HenFactory.getHen(Continent.ASIA);
        //Hen hen2 = HenFactory.getHen(Continent.EUROPE);
        //Hen hen3 = HenFactory.getHen(Continent.NORTHAMERICA);

        hen.getMonthlyEggCount();
        //hen1.getMonthlyEggCount();
        //hen2.getMonthlyEggCount();
        //hen3.getMonthlyEggCount();

    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            if(continent.equals(Continent.NORTHAMERICA))
                hen=new NorthAmericanHen();
            if(continent.equals(Continent.ASIA))
                hen=new AsianHen();
            if(continent.equals(Continent.EUROPE))
                hen=new EuropeanHen();
            if(continent.equals(Continent.AFRICA))
                hen =new AfricanHen();
            return hen;

        }
    }
}
