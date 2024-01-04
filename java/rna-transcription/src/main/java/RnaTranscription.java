import java.util.*;

class RnaTranscription {

    String transcribe(String dna) {
        HashMap<String, String> strandRelations = new HashMap<>();
        strandRelations.put("G", "C");
        strandRelations.put("C", "G");
        strandRelations.put("T", "A");
        strandRelations.put("A", "U");
        String rna = "";
        for (int i = 0; i < dna.length(); i++) {
            rna += strandRelations.get(dna.charAt(i) + "");
        }
        return rna;
    }

}
