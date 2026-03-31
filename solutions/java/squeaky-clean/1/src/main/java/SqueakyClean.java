class SqueakyClean {

  static String clean(String identifier) {
    StringBuilder formatBuilder = new StringBuilder();

    if (identifier.isEmpty()) return "";

    for (int i = 0; i < identifier.length(); i++) {
      char c = identifier.charAt(i);

      // Use the '\0' (null character) as a placeholder for characters to skip
      char newChar = switch (c) {
        case ' ' -> '_';
        case '4' -> 'a';
        case '3' -> 'e';
        case '0' -> 'o';
        case '1' -> 'l';
        case '7' -> 't';
        case '-' -> Character.toUpperCase(identifier.charAt(++i));
        default -> Character.isLetter(c) ? c : '\0';
      };

      if (newChar != '\0') {
        formatBuilder.append(newChar);
      }
    }
    return formatBuilder.toString();
  }
}