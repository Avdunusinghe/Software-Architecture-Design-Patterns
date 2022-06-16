package com.pattern.singleton;

public class Main  implements Runnable {

    public  static void main(String[] args){
        new Thread(new Main()).start();

        for (int i = 0; i < 10; i++){
            Singleton.getInstance();

        }
    }

    @Override
    public void run() {

    }
}
