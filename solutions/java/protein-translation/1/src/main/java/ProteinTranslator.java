import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    private Map<String,String> proteinMap = new HashMap<>() {{
        put("AUG", "Methionine");
        put("UUU", "Phenylalanine");
        put("UUC", "Phenylalanine");
        put("UUA", "Leucine");
        put("UUG", "Leucine");
        put("UCU", "Serine");
        put("UCC", "Serine");
        put("UCA", "Serine");
        put("UCG", "Serine");
        put("UAU", "Tyrosine");
        put("UAC", "Tyrosine");
        put("UGU", "Cysteine");
        put("UGC", "Cysteine");
        put("UGG", "Tryptophan");
        put("UAA", "STOP");
        put("UAG", "STOP");
        put("UGA", "STOP");
    }};


    List<String> translate(String rnaSequence) {
        List<String> proteinList = new ArrayList<>();

        // Break the rna sequence into their triplets
        // evaluate the sequence for a valid length or
        // a triplet containing the 'STOP' sequence
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            // Capture the current triplet
            String codonSequence = rnaSequence.substring(i, i + 3);
            // Here is where we look for the valid length or
            // the stop sequence
            if (rnaSequence.length() % 3 != 0
                && !(rnaSequence.contains("UAA") || rnaSequence.contains("UAG") || rnaSequence.contains("UGA"))) {
                throw new IllegalArgumentException("Invalid codon");
                // execution stops - the list is empty
            }

            // Assuming a sequence with a valid length, check
            // the map against the codonSequence
            if (proteinMap.containsKey(codonSequence)){
                // keep evaluating until we hit a stop sequence
                // then return the list and drop out
                if (proteinMap.get(codonSequence).equals("STOP")) {
                    return proteinList;
                }
                // if it doesn't have a stop sequence, then we
                // add to the list
                proteinList.add(proteinMap.get(codonSequence));
            } else {
                // if the map doesn't come back with a valid sequence
                // then throw the exception and stop executing
                throw new IllegalArgumentException("Invalid codon");
            }
        }
        return proteinList;
    }
}