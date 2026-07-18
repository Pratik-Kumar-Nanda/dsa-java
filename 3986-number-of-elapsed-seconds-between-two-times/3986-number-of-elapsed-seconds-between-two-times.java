class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start = new String[3];
        start = startTime.split(":");
        String[] end = new String[3];
        end = endTime.split(":");
        int sum = 0;
        int first=0;
        int second=0;

        first = Integer.parseInt(start[0])*3600 + Integer.parseInt(start[1])*60 + Integer.parseInt(start[2]);
        second = Integer.parseInt(end[0])*3600 + Integer.parseInt(end[1])*60 + Integer.parseInt(end[2]);
        return second-first;
    }
}