package org.collection.set.reversetreeset;

public class ReverseTreeSet implements Comparable<ReverseTreeSet> {

    String name;

    public ReverseTreeSet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ReverseTreeSet o) {
        if (o.getName().equals(this.name)){
            return 0;
        } else if (o.getName().charAt(0) > this.name.charAt(0)){
            return 1;
        } else{
            return -1;
        }
    }

}
