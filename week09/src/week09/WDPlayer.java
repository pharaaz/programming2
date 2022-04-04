package week09;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class WDPlayer implements Comparable<WDPlayer>{
	private String playerName;
	private int nPieces;
	private int nPrevent;
	
	 public WDPlayer(String playerName, int nPieces, int nPrevent) {
	       this.playerName = playerName;
	       this.nPieces = nPieces;
	       this.nPrevent = nPrevent;
	   }
	
	public String getPlayerName() {
		return this.playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName=playerName;
	}
	public int getNPieces() {
		return this.nPieces;
	}
	public void setNPieces(int nPieces) {
		this.nPieces=nPieces;
	}
	public int getNPrevent() {
		return this.nPrevent;
	}
	public void setNPrevent(int nPrevent) {
		this.nPrevent=nPrevent;
	}
	
	public Double rank() {
		double rank;
		if(nPieces*nPrevent ==0) {
			rank = 0;
		}
		else {
		 rank = 1-1/(nPieces*nPrevent);
		}
		return rank;
	}
	
	@Override
	public int compareTo(WDPlayer o) {
		return this.rank().compareTo(o.rank());
		
	}
	
	public static ArrayList<WDPlayer> inputPlayer(){
		ArrayList<WDPlayer> player = new ArrayList<WDPlayer>() ;
	       Scanner scanner = new Scanner(System.in);
	       int stop = 3;
	       
        while(stop != 9) {
	          
	           System.out.println("Enter Name or stop to exit:");
	           String playerName = scanner.next();
	           if(playerName.equalsIgnoreCase("stop")) {
	        	   stop =9;
	           }
	           else {
	        	   System.out.println("Enter number of information pieces:");
		           int nPieces = scanner.nextInt();
		           System.out.println("Enter collected and crimes prevented:");
		           int nPrevent = scanner.nextInt();
		           
		           Collections.addAll(player, new WDPlayer(playerName, nPieces, nPrevent));
	           } 
        }
        
	       Collections.sort(player);
	       
	       return player;
	     }
	
	@Override
	public String toString() {
	       return "\nPLayer name: " +playerName 
	    		   +", number of information pieces:" +nPieces 
	    		   +", collected and crimes prevented:" +nPrevent 
	    		   +", Rank: " +rank();
	   }
	
	  public static void main(String[] args) {
	       ArrayList<WDPlayer> players =inputPlayer();
	       System.out.println(players);    
	   }
	

}
