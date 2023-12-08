import java.util.HashSet;
import java.util.Set;

public class SpellCheckAndSpaceCorrection {
                    public static void checkSpellingAndSpace(String sentence) {
                                        // Predefined dictionary of words
                                        Set<String> dictionary = new HashSet<>();
                                        dictionary.add("environment");
                                        dictionary.add("always");
                                        dictionary.add("protect");
                                        dictionary.add("irreplaceable");
                                        dictionary.add("different");
                                        dictionary.add("absolutely");
                                        dictionary.add("greatest");
                                        dictionary.add("glory");
                                        dictionary.add("Predictable");
                                        dictionary.add("flavour");
                                        dictionary.add("should");
                                        dictionary.add("order");
                                        // dictionary.add("just");

                                        // Check if the sentence contains at least two words
                                        String[] words = sentence.split(" ");
                                        if (words.length < 2) {
                                                            System.out.println("Invalid input");
                                                            return;
                                        }

                                        StringBuilder correctedSentence = new StringBuilder();
                                        for (String word : words) {
                                                            // Convert the word to lowercase for case-insensitive
                                                            // comparison
                                                            word = word.toLowerCase();

                                                            // Check if the word is in the dictionary
                                                            if (dictionary.contains(word)) {
                                                                                correctedSentence.append(word).append(" ");
                                                            } else {
                                                                                // If the word is not in the dictionary,
                                                                                // look for a similar word with one
                                                                                // character difference
                                                                                boolean foundCorrection = false;
                                                                                for (String dictWord : dictionary) {
                                                                                                    if (word.length() == dictWord.length()) {
                                                                                                                        int diffCount = 0;
                                                                                                                        for (int i = 0; i < word.length(); i++) {
                                                                                                                                            if (word.charAt(i) != dictWord.charAt(i)) {
                                                                                                                                                                diffCount++;
                                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (diffCount == 1) {
                                                                                                                                            correctedSentence.append(dictWord).append(
                                                                                                                                                                                    " ");
                                                                                                                                            foundCorrection = true;
                                                                                                                                            break;
                                                                                                                        }
                                                                                                    }
                                                                                }

                                                                                if (!foundCorrection) {
                                                                                                    correctedSentence.append(word).append(" ");
                                                                                }
                                                            }
                                        }

                                        // Remove the trailing space and extra spaces and print the corrected sentence
                                        String correctedOutput = correctedSentence.toString().trim().replaceAll("\\s+",
                                                                                " ");
                                        System.out.println(correctedOutput);
                    }

                    public static void main(String[] args) {
                                        // Example usage:
                                        String sentence = "we should protected   our   enviroment always";
                                        checkSpellingAndSpace(sentence);
                    }
}
