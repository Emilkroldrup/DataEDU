public class Opgave5 {
    public static void main(String[] args) {
        char[] karTabel = {'a', 'b', 'c', 'a', 'd', 'a', 'b', 'c', 'a', 'z', 'a'};
        char kar = 'a';

        int forekomster = antalForekomster(karTabel, kar);
        System.out.println("Antal forekomster af '" + kar + "': " + forekomster);
    }


    public static int antalForekomster(char[] karTabel, char kar) {
        int count = 0;
        for (char c : karTabel) {
            if (c == kar) {
                count++;
            }
        }
        return count;
    }
}
