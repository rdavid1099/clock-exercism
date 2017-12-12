class Clock {
    private int rawHour, rawMin;
    private String hour, minute;

    public Clock(int hour, int min) {
        this.rawHour = hour % 24;
        this.rawMin = min;
    }

    public String toString() {
        convertRawTime();
        return hour + ":" + minute;
    }

    private void convertRawTime() {
        hour   = formatNum(rawHour);
        minute = formatNum(rawMin);
    }

    private String formatNum(int rawNum) {
        String displayNum = Integer.toString(rawNum);
        return (rawNum < 10) ? "0" + displayNum : displayNum;
    }
}
