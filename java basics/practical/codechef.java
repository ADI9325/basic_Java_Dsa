import java.io.*;
import java.util.*;

public class codechef {

                    public static void main(String[] args) throws IOException {
                                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

                                        int numTestCases = Integer.parseInt(reader.readLine());

                                        while (numTestCases-- > 0) {
                                                            int numRounds = Integer.parseInt(reader.readLine());
                                                            String chefMoves = reader.readLine();
                                                            String chefinaMoves = reader.readLine();

                                                            int roundsToChange = calculateRoundsToChange(numRounds,
                                                                                                    chefMoves,
                                                                                                    chefinaMoves);

                                                            writer.write(roundsToChange + "\n");
                                        }

                                        writer.flush();
                    }

                    public static int calculateRoundsToChange(int numRounds, String chefMoves, String chefinaMoves) {
                                        int roundsToChange = 0;

                                        for (int i = 0; i < numRounds; i++) {
                                                            char chefMove = chefMoves.charAt(i);
                                                            char chefinaMove = chefinaMoves.charAt(i);

                                                            if (chefMove != chefinaMove) {
                                                                                roundsToChange++;
                                                            }
                                        }

                                        return roundsToChange;
                    }
}
