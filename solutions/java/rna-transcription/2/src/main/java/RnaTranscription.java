class RnaTranscription {

    String transcribe(String dnaStrand) {

        // we need to check for a null or empty string
        // ==============================================        
        if (dnaStrand == null || dnaStrand.isEmpty()) {
            return "";
        }

        // create a string builder object and set it to
        // the length of the input string
        // ==============================================
        StringBuilder rnaBuilder = new StringBuilder(dnaStrand.length());

        // build out the RNA transcription
        // ==============================================        
        for (char c : dnaStrand.toCharArray()) {
            switch (c) {
                case 'G' -> rnaBuilder.append('C');
                case 'C' -> rnaBuilder.append('G');
                case 'T' -> rnaBuilder.append('A');
                case 'A' -> rnaBuilder.append('U');
                default -> throw new IllegalArgumentException("Invalid DNA base: " + c);
            }
        }
        return rnaBuilder.toString();
    }
}
