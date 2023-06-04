package basic;

public abstract class Fish extends Inhabitant implements waterSpeed{
    protected int wspeed;

    public Fish(String breed, int wspeed) {
        super(breed);
        this.wspeed = wspeed;
    }


    @Override
    public int getWaterSpeed() {
        return wspeed;
    }

    @Override
    public String food() {
        return "Червячки";
    }

    @Override
    public String type() {
        return "Рыбка\n";
    }

    @Override
    public String toString() {
        return String.format("%s   Скорость плавания: %d", super.toString(), getWaterSpeed());
    }
}
