class Clock {
    private int rawHour, rawMin;
    private String hour, minute;
    public Clock(int hour, int min) {
        this.rawHour = hour;
        this.rawMin = min;
    }

    public String toString() {
        convertRawTime();
        return hour + ":" + minute;
    }

    private void convertRawTime() {
        hour   = formatNum(Integer.toString(rawHour));
        minute = formatNum(Integer.toString(rawMin));
    }

    private String formatNum(String rawNum) {
        return (rawHour < 10) ? "0" + rawNum : rawNum;
    }
}
