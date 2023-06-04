import creatures.CatFish;
import creatures.GoldFish;
import creatures.Snail;
import creatures.Turtle;
public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addInhabitant(new GoldFish("Золотая рыбка",3))
                .addInhabitant(new GoldFish("Карась",6))
                .addInhabitant(new GoldFish("Пиранья",4))
                .addInhabitant(new CatFish("Сомик обыкновенный",2))
                .addInhabitant(new CatFish("Сомик черный",6))
                .addInhabitant(new Snail("Улитка",10))
                .addInhabitant(new Snail("Гигантская улитка",2))
                .addInhabitant(new Turtle("Красноухая черепаха",5,2))
                .addInhabitant(new Turtle("Чернохвостая черепаха",8,8))
                ;
        System.out.println(aquarium);
        System.out.println("\nЧемпион Плавун");
        System.out.println(aquarium.getWaterSpeedChamp());

    }
}