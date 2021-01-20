public class Main {

    public static void main (String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("November 2016",
                "abcdefghijklmnopqrstuvwyz",
                "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }



    public static String norm(String name) {
        String lowerCased = name.toLowerCase();
        String capitalized = lowerCased.substring(0, 1).toUpperCase();
        String properNoun = capitalized + lowerCased.substring(1);
        return properNoun;

    }
    public static String init(String name) {
        String[] arr = name.split(" ");
        String firstInitial = arr[0].substring(0, 1).toUpperCase();
        String secondInitial = arr[1].substring(0, 1).toUpperCase();

        if(arr.length == 2) {

            return firstInitial + ". " + norm(arr[1]);
        }

        return firstInitial + ". " + secondInitial + ". " + norm(arr[2]);
    }

    public static String tr(String s, String from, String to) {

        if( from.length() != to.length() ) {
            return null;
        }

        char[] chars = s.toCharArray();
        char[] toReturn = new char[s.length()];

        for(int i = 0; i < chars.length; i++) {
            toReturn[i] = replace(chars[i],  from,  to);
        }

        return String.valueOf(toReturn);
    }

    public static char replace(char chr, String from, String to) {
        if(from.indexOf(chr) == -1) {
            return chr;
        }

        int index = from.indexOf(chr);

        return to.charAt(index);
    }

}
