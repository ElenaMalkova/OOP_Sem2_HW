package basic;

public abstract class Amphibia extends Inhabitant implements waterSpeed, soilSpeed {

    protected int wspeed, sspeed;

    public Amphibia(String breed, int wspeed, int sspeed) {
        super(breed);
        this.wspeed = wspeed;
        this.sspeed = sspeed;
    }
    @Override
    public int getWaterSpeed() {
        return wspeed;
    }
    @Override
    public int getSoilSpeed() {
        return sspeed;
    }
    @Override
    public String food() {
        return "Корм из пакетика";
    }
    @Override
    public String type() {
        return "Амфибия\n";
    }
    @Override
    public String toString() {
        return String.format("%s   Скорость плавания: %d  Скорость ползанья: %d", super.toString(), getWaterSpeed(), getSoilSpeed());
    }
}
