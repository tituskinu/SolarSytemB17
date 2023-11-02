package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solasys=new solarSystemBasics();
        solasys.Sun="1";
        solasys.Moon="2";
        solasys.Planets="3";
        solasys.Stars="10";



        FeatureSun Sun=new FeatureSun();
        Sun.name="Titus";
        Sun.color="Black";
        Sun.temp="Hot";

        planet_2 pluto=new planet_2();
        pluto.color="green";
        pluto.name="abracadabda";
        pluto.temp="100000000";
        pluto.radius="854566565656km";

    }
}
