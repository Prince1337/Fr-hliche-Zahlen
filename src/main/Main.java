package main;

public class Main {

    public static void main(String[] args) {
        FroehlicheZahlen froehlicheZahlen = new FroehlicheZahlen();
        for(int i = 1; i < 101; i++){
            if(froehlicheZahlen.isFroehlich(i))
                System.out.println(i + " ist fröhlich");
        }
    }
}
