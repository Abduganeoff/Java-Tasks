public class Task06 {
    public static  final  String[][] arr =
            {
                    {"Germany", "2", "Scotland", "1"},
                    {"Poland", "2", "Germany", "0"},
                    {"Germany", "1", "Ireland", "1"},
                    {"Poland", "2", "Scotland", "2"},
                    {"Scotland", "1", "Ireland", "0"},
                    {"Ireland", "1", "Poland", "1"},
                    {"Ireland", "1", "Scotland", "1"},
                    {"Germany", "3", "Poland", "1"},
                    {"Scotland", "2", "Germany", "3"},
                    {"Ireland", "1", "Germany", "0"},
                    {"Scotland", "2", "Poland", "2"},
                    {"Poland", "2", "Ireland", "1"},
            };


           public static String[][] scores = {
                    {"Germany", "0"},
                    {"Ireland", "0"},
                    {"Poland", "0"},
                    {"Scotland", "0"},
            };

    public static void main(String[] args) {

        for(int i = 0; i < arr.length; i++) {
                int teamScore1 = Integer.parseInt(arr[i][1]);
                int teamScore2 = Integer.parseInt(arr[i][3]);
                String team1 = arr[i][0];
                String team2 = arr[i][2];

                if(teamScore1 > teamScore2) {
                    match(team1, 3);
                } else if(teamScore1 < teamScore2) {
                    match(team2, 3);
                } else if (teamScore1 == teamScore2) {
                    match(team1, 1);
                    match(team2, 1);
                }
        }

        printScores(scores);
    }

    public static void match(String team, int score) {

        switch (team){
            case "Germany":
               scores[0][1] = Integer.toString(Integer.parseInt(scores[0][1]) + score);
                break;
            case "Ireland":
                scores[1][1] = Integer.toString(Integer.parseInt(scores[1][1]) + score);
                break;
            case "Poland":
                scores[2][1] = Integer.toString(Integer.parseInt(scores[2][1]) + score);
                break;
            case "Scotland":
                scores[3][1] = Integer.toString(Integer.parseInt(scores[3][1]) + score);
                break;
        }
    }

    public static void printScores(String[][] scores){
        for (int i = 0; i < scores.length; i ++) {
            for (int j = 0; j < scores[i].length; j++);
            System.out.println(scores[i][0] + " scored: " + scores[i][1]);
        }
    }
}
