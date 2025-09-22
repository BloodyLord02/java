package com.education.ztu.game;

import java.util.Comparator;

public class AgeNameComparator implements Comparator<Participant> {
    @Override
    public int compare(Participant p1, Participant p2) {
        int nameComparison = p1.getName().compareTo(p2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return p1.getName().compareTo(p2.getName());
    }
}
