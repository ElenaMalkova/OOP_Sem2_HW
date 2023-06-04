import basic.Inhabitant;
import basic.waterSpeed;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private final List<Inhabitant> inhabitants = new ArrayList<>();

    public Aquarium addInhabitant(Inhabitant creature) {
        inhabitants.add(creature);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("В аквариуме:\n");
        for (Inhabitant item :
                inhabitants) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }

    public List<waterSpeed> swimming() {
        List<waterSpeed> swimming = new ArrayList<>();
        for (Inhabitant creature : inhabitants) {
            if (creature instanceof waterSpeed) {
                swimming.add((waterSpeed) creature);
            }
        }
        return swimming;
    }
    public waterSpeed getWaterSpeedChamp() {
        List<waterSpeed> swimmers = swimming();
        waterSpeed champ = swimmers.get(0);
            for (waterSpeed swcreature : swimmers) {
                if (champ.getWaterSpeed() < swcreature.getWaterSpeed()) {
                    champ = swcreature;
                }
            }
        return champ;
    }
}