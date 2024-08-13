package org.example;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {
    private int[] currentRange;

    private List<Integer> pinsRanges = new ArrayList<>();

    public RecentCounter() {
        this.currentRange = new int[2];
    }

    public int ping(int t) {
        currentRange[0] = t - 3000;
        currentRange[1] = t;
        List<Integer> temp;
        if(pinsRanges.isEmpty()){
            pinsRanges.add(t);
        } else {
            for (Integer ping : pinsRanges.reversed()) {
                if(ping < currentRange[0]){
                    temp = pinsRanges.subList(pinsRanges.indexOf(ping)+1, pinsRanges.size());
                    pinsRanges = temp;
                    break;
                }
            }
            pinsRanges.add(t);
        }
        return pinsRanges.size();
    }

}
