class Clock {
    private int rawHour, rawMin, addHours = 0;
    private String hour, minute;

    public Clock(int hour, int min) {
        this.rawMin = minutesInHours(min);
        this.rawHour = (hour + addHours) % 24;
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
        if (initMin / 60 == 0) return initMin;
        addHours = initMin / 60;
        return initMin % 60;
    }
}
