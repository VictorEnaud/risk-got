package usecase;

import domain.Kingdom;

import java.util.HashMap;
import java.util.Map;

public class CreateKingdomList {
    public Map<String, Kingdom> createKingdomList() {
        HashMap<String, Kingdom> kingdomList = new HashMap<>();

        Kingdom crownlandsKingdom = new Kingdom("Crownlands");
        Kingdom dorneKingdom = new Kingdom("Dorne");
        Kingdom northKingdom = new Kingdom("North");
        Kingdom reachKingdom = new Kingdom("Reach");
        Kingdom riverlandsKingdom = new Kingdom("Riverlands");
        Kingdom stormlandsKingdom = new Kingdom("Stormlands");
        Kingdom valeKingdom = new Kingdom("Vale");
        Kingdom westerlandsKingdom = new Kingdom("Westerlands");

        kingdomList.put(crownlandsKingdom.getName(), crownlandsKingdom);
        kingdomList.put(dorneKingdom.getName(), dorneKingdom);
        kingdomList.put(northKingdom.getName(), northKingdom);
        kingdomList.put(reachKingdom.getName(), reachKingdom);
        kingdomList.put(riverlandsKingdom.getName(), riverlandsKingdom);
        kingdomList.put(stormlandsKingdom.getName(), stormlandsKingdom);
        kingdomList.put(valeKingdom.getName(), valeKingdom);
        kingdomList.put(westerlandsKingdom.getName(), westerlandsKingdom);
        return kingdomList;
    }
}
