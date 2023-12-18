import actions.*;
import characters.*;

public class Main {
    public static void main(String[] args){
        KAROTISHKI Karotishki = new KAROTISHKI();
        SHPUNTIK shpuntik = new SHPUNTIK();
        VINTIK vintik = new VINTIK();
        PONCHIK ponchik = new PONCHIK();
        ZNAIKA znaika = new ZNAIKA();

        StartedToBring stb = new StartedToBring();
        AdaptedToWeightlessness adaptedToWeightlessness = new AdaptedToWeightlessness();
        AtePorridge ate_porridge = new AtePorridge();
        Cooked cooked = new Cooked();
        Dangled dangled = new Dangled();
        GetAttached getAttached = new GetAttached();
        MadeObservations madeObservations = new MadeObservations();
        Named named = new Named();
        NotWorked not_worked = new NotWorked();
        Say say = new Say();
        SnuckIn snuckIn = new SnuckIn();
        WantedToEat wantedToEat = new WantedToEat();
        Worked worked = new Worked();


        Karotishki.doAction(stb, "всё, что нужно для приглотовления обеда " + shpuntik.getName());
        Karotishki.doAction(worked, "");
        Karotishki.doAction(wantedToEat, "");
        vintik.doAction(not_worked, "");
        ponchik.doAction(dangled, "");
        znaika.doAction(say, ", что " + ponchik.getName() + " возможно не приспособился к невесомости");
        ponchik.doAction(adaptedToWeightlessness, "");
        ponchik.doAction(ate_porridge, "");
        Karotishki.doAction(cooked, "");
        znaika.doAction(getAttached, "");
        znaika.doAction(madeObservations, "");
        znaika.doAction(named, "");
        Karotishki.doAction(snuckIn, "");
        ponchik.fly();

        ponchik.doAction(cooked, "");
        Karotishki.doAction(dangled, "");
        System.out.println(znaika.Gender());
        System.out.println(znaika);
    }
}