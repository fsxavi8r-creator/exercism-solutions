
class BirdWatcher {
    private final int[] birdsPerDay;
    private static final int[] BIRDS_LAST_WEEK = {0,2,5,3,7,8,4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return BIRDS_LAST_WEEK;
    }

    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }    

    public boolean hasDayWithoutBirds() {
        for (int dayCount : birdsPerDay) {
            if (dayCount == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int busyDay : birdsPerDay) {
            if (busyDay >= 5) busyDays++;
        }
        return busyDays;
    }
}
