package by.homework3;

public class FourthTask {
    public static void main(String[] args) {
        String str = "Do you have a plan ? I don't have even a pla";
        String[] split = str.split(" ");
        for (String words : split
        ) {
            System.out.println(words);
        }
        System.out.println();
        for (int i = 0; i < split.length; i++) {
            int count = 1;
            if (split[i] == null) {
                continue;
            }
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(split[j])) {
                    split[j] = null;
                    count++;
                }
            }
            System.out.println("Word: " + split[i] + " appears " + count + " time(s).");
        }
    }
}
