package usecase;

import domain.Kingdom;

import java.util.LinkedHashSet;
import java.util.Set;

public class CreateKingdomList {
    public Set<Kingdom> createKingdomList() {
        LinkedHashSet<Kingdom> kingdomSet = new LinkedHashSet<>();
        kingdomSet.add(new Kingdom("Crownlands"));
        kingdomSet.add(new Kingdom("Dorne"));
        kingdomSet.add(new Kingdom("North"));
        kingdomSet.add(new Kingdom("Reach"));
        kingdomSet.add(new Kingdom("Riverlands"));
        kingdomSet.add(new Kingdom("Stormlands"));
        kingdomSet.add(new Kingdom("Vale"));
        kingdomSet.add(new Kingdom("Westerlands"));
        return kingdomSet;
    }
}
