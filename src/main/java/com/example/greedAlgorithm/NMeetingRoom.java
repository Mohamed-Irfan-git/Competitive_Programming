package com.example.greedAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class NMeetingRoom {
    public static class Meeting {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int nMeetingsInOneRoom(Meeting [] meetings){
        Arrays.sort(meetings,new Comparator<Meeting>(){
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.end - o2.end;
            }
        });

        int count = 0;
        int end = 0;

        for(Meeting meeting : meetings){
            if(meeting.start >= end){
                end = meeting.end;
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Meeting[] meetings = {
                new Meeting(1,2),
                new Meeting(3,4),
                new Meeting(0,6),
                new Meeting(5,7),
                new Meeting(8,9),
                new Meeting(5,9),
                new Meeting(10,17)
        };
        System.out.println(nMeetingsInOneRoom(meetings));
    }
}
