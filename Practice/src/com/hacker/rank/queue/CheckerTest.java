package com.hacker.rank.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class CheckerTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player player[] = new Player[n];
        
        for(int i=0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, new Comparator<Player>(){
            public int compare(Player p1, Player p2){
                
                if(p1.score==p2.score){
                    if(!p1.name.equals(p2.name)){
                        return p1.name.compareTo(p2.name);
                    }
                    return 0;
                }
                else return p2.score - p1.score;
            }

        });
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
