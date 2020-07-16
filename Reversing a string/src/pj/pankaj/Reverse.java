package pj.pankaj;

public class Reverse{

    public String reverse(String line) {

        String output = "";
        int j = line.length() - 1;
        int i = line.length() - 1;


        for (i = line.length() - 1; i >= 0; i--) {
            if (line.charAt(i) == ' ') {
                j = i;
                continue;
            }

            while (line.charAt(i) != ' ') i--;
            if (output.isEmpty()) {
                output = output.concat(line.substring(i + 1, j));
            } else {
                output = output.concat(" " + line.substring(i + 1, j));
            }
        }
        return output;
    }
}
