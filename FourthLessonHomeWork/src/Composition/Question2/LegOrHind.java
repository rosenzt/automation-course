package Composition.Question2;

public class LegOrHind {

    boolean[] legOrHind = new boolean[4];

    public LegOrHind(boolean[] legOrHind) {
        this.legOrHind = legOrHind;
    }

    public boolean[] getLegOrHind() {
        return legOrHind;
    }

    public void setLegOrHind(boolean[] legOrHind) {
        this.legOrHind = legOrHind;
    }

    public int howManyLegs() {
        int numberOfLegs = 0;
        for (int i = 0; i < legOrHind.length; i++) {
            if (legOrHind[i]) {
                numberOfLegs++;
            }//if
        }//for
        return numberOfLegs;
    }//howManyLegs

}//class
