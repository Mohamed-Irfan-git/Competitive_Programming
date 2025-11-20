package com.example.thread;

public class Song  implements Runnable {

    String [] song;
    int [] timings;

    public Song(String[] song,int [] timings) {
        this.song = song;
        this.timings = timings;
    }
    @Override
    public void run() {
        for (int i =0;i<song.length;i++)  {
                System.out.println(song[i]);
            try {
                Thread.sleep(timings[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        String [] lyrics = new String[5];
        int [] timing = new int[5];

    }

}
