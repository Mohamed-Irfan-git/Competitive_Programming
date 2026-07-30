package com.example.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvexHull {
    public static class Point implements Comparable<Point>{
        int x;
        int y;

        Point(int x,int y){
            this.x= x;
            this.y=y;
        }

        @Override
        public int compareTo(Point other) {
            if (this.x != other.x)
                return Integer.compare(this.x, other.x);
            return Integer.compare(this.y, other.y);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static class Geometry{
        int cross(Point A, Point B){
            return A.x * B.y - A.y * B.x;

        }

        int orientation(Point A, Point B,Point C){
            Point AC = new Point(C.x-A.x,C.y-A.y);
            Point AB = new Point(B.x-A.x,B.y-A.y);

            return cross(AB,AC);
        }

        List<Point> convexHUll(List<Point> points){
            Collections.sort(points);
            List<Point> hull = new ArrayList<>();
            for(Point p : points){

                while(hull.size()>=2 && orientation(
                        hull.get(hull.size()-2),
                        hull.get(hull.size()-1),p)<=0){

                    hull.remove(hull.size()-1);
                }
                hull.add(p);
            }

            int lastIndex = hull.size();

            for(int i = points.size()-2;i>=0;i--){
                Point p = points.get(i);

                while(hull.size() > lastIndex && orientation(
                        hull.get(hull.size()-2),
                        hull.get(hull.size()-1),p)<=0){

                    hull.remove(hull.size()-1);
                }
                hull.add(p);

            }

            hull.remove(hull.size()-1);

            return hull;
        }
    }

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        points.add(new Point(0, 0));
        points.add(new Point(0, 4));
        points.add(new Point(4, 0));
        points.add(new Point(4, 4));

        points.add(new Point(2, 2));
        points.add(new Point(1, 1));
        points.add(new Point(3, 3));
        points.add(new Point(2, 1));

        Geometry g = new Geometry();

        List<Point> hull = g.convexHUll(points);

        System.out.println(hull);
    }
}
