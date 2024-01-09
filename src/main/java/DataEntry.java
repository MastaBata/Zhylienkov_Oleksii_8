class DataEntry implements Comparable<DataEntry> {
    String time;
    double value;

    public DataEntry(String time, double value) {
        this.time = time;
        this.value = value;
    }

    // Implementing compareTo method for sorting
    @Override
    public int compareTo(DataEntry other) {
        return Double.compare(this.value, other.value);
    }
}