package HackerRankSorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CopyComparatorScore {

	public static void main(String[] args) {
		nameScore();
	}
//=======================================
	public static void nameScore() {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //array size with scanner

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
        
        Arrays.sort(player, checker);
        
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
	}
} 
//==========================================
class Checker implements Comparator<Player>{
    @Override
    public int compare(Player a, Player b){
        if (a.score == b.score){
            return a.name.compareTo(b.name);//alphabetically
        } else {
            return b.score - a.score;//decreasing 
        }
    }
}
//==========================================
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
/*
class PlayerComparator implements Comparator<Player> {
    
    public int compare(Player A, Player B) {
        int score = B.score - A.score;
        if(score != 0) {
            return score;
        }
        else {
            return B.name.compareTo(A.name);            
        }
    }
}

class Checker {
    public Comparator<Player> desc;
    
    public Checker() {
        desc = new PlayerComparator();
    }
}
*/