package org.example;

public class nearestValidPoint {
    public static void main(String[] args) {
        int[][] test = {{1,2}, {3,1}, {2,4}, {2,3}, {4,4}};
        System.out.println(nearestValidPoint(3,4,test));

    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int smallestIndexOfNearestPoint = -1;
        int manthanatnDistanceOfNearestPoint = 0;
        for (int i = 0; i < points.length; i++) {
            int pointX = points[i][0];
            int pointY = points[i][1];
            if(x == pointX || y == pointY){
                if(smallestIndexOfNearestPoint < 0){
                    smallestIndexOfNearestPoint = i;
                    manthanatnDistanceOfNearestPoint = Math.abs(x-pointX)+Math.abs(y-pointY);
                } else {
                    int tempManhatanDist = Math.abs(x-pointX)+Math.abs(y-pointY);
                    if(tempManhatanDist < manthanatnDistanceOfNearestPoint){
                        manthanatnDistanceOfNearestPoint = tempManhatanDist;
                        smallestIndexOfNearestPoint = i;
                    }
                }
            }
        }
        return smallestIndexOfNearestPoint;
    }
}
