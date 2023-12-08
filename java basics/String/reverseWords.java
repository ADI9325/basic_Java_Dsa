public class reverseWords {
                    public static void reverseString(String s) {
                                        String sb = "";
                                        String[] Ch = s.split(" ");
                                        for (int i = Ch.length - 1; i >= 0; i--) {

                                                            if (!Ch[i].isEmpty()) {
                                                                                sb += Ch[i].trim() + " ";
                                                            }
                                        }
                                        System.out.println(sb);

                    }

                    public static void main(String[] args) {
                                        String s = new String("  i    a     m   a    d    i  t y a");
                                        reverseString(s);

                    }

}
