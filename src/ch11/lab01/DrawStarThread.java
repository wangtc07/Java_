package ch11.lab01;

public class DrawStarThread extends Thread {
    int x;
	int y;
    String s;

	public void run(){
        for (int i = 0; i <+ x; i++) {
            for (int j = 0; j <= x; j++) {
                System.out.println(s);
            }
        }
	}

    public DrawStarThread(int x , int y ,String s){
        this.x = x;
        this.y = y;
        this.s = s;
    }
    
}
