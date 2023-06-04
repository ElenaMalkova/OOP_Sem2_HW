package creatures;

import basic.Fish;
import basic.waterSpeed;

public class CatFish extends Fish implements waterSpeed {

    public CatFish(String breed, int wspeed) {
        super(breed, wspeed);
    }
}