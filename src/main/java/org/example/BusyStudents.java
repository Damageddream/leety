package org.example;

public class BusyStudents {
    public static void main(String[] args) {
        int[] startTestOne = {1,2,3};
        int[] endTestOne = {3,2,7};

        int[] startTestTwo = {4};
        int[] endTestTwo = {4};

        System.out.println(busyStudent(startTestOne, endTestOne, 4));
        System.out.println(busyStudent(startTestTwo, endTestTwo, 4));


    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int studentsLearningOnTime = 0;

        for (int i = 0; i < startTime.length; i++) {
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                studentsLearningOnTime++;
            }
        }
        
        return studentsLearningOnTime;
    }
}
