class Clock {
    private int rawHour, rawMin, addHours = 0;
    private String hour, minute;

    public Clock(int hour, int min) {
        this.rawMin = minutesInHours(min);
        this.rawHour = calcRolloverHours(hour + addHours);
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

    private int minutesInHours(int initMin) {
        addHours = (initMin >= 0) ? initMin / 60 : (-60 + initMin) / 60;
        return (initMin >= 0) ? initMin % 60 : 60 + (initMin % 60);
    }

    private int calcRolloverHours(int initHour) {
        return (initHour >= 0) ? initHour % 24 : 24 + (initHour % 24);
    }
}
