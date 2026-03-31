import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> cardSet = new HashSet<>(cards);
        return cardSet;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        // do I have a card in my collection that they don't have?
        boolean canITrade = !theirCollection.containsAll(myCollection);

        // do they have a card in their collection that I don't have?
        boolean canTheyTrade = !myCollection.containsAll(theirCollection);

        // if they're both true then we can trade
        return canITrade && canTheyTrade;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        // if the collections is empty, why bother? drop out
        // and return an empty set
        if (collections.isEmpty()) {
            return new HashSet<>();
        }

        // set things up with a copy of a persons collection
        Set<String> commonCards = new HashSet<>(collections.get(0));

        // keep the cards that only show up in every other persons collection
        for (int i = 1; i < collections.size(); i++) {
            commonCards.retainAll(collections.get(i));
        }

        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> combinedCollections = new HashSet<>();

        for (Set<String> collection : collections) {
            combinedCollections.addAll(collection);
        }

        return combinedCollections;
    }
}
