class RnaTranscription {

    String transcribe(String dnaStrand) {

        if (dnaStrand == null || dnaStrand.isEmpty()) {
            return "";
        }

        StringBuilder rnaBuilder = new StringBuilder(dnaStrand.length());

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
