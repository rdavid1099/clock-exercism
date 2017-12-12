class Clock {
    private int rawHour, rawMin, addHours = 0;
    private String hour, minute;

    public Clock(int hour, int min) {
        addHours = (min >= 0) ? min / 60 : (-60 + min) / 60;
        this.rawMin = calcRolloverTime(min, 60);
        this.rawHour = calcRolloverTime(hour + addHours, 24);
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

    private int calcRolloverTime(int initTime, int amount) {
        return (initTime >= 0) ? initTime % amount : amount + (initTime % amount);
    }
}
