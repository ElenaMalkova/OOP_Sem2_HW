package basic;

public abstract class Mollusk extends Inhabitant implements soilSpeed {
    protected int sspeed;

    public Mollusk(String breed, int sspeed) {
        super(breed);
        this.sspeed = sspeed;
    }

    @Override
    public int getSoilSpeed() {
        return sspeed;
    }

    @Override
    public String food() {
        return "Что найдет";
    }

    @Override
    public String type() {
        return "Моллюск\n";
    }

    @Override
    public String toString() {
        return String.format("%s   Скорость ползания: %d", super.toString(), getSoilSpeed());
    }
}
