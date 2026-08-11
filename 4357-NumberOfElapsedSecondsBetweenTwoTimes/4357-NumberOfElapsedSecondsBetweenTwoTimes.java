// Last updated: 8/11/2026, 2:13:52 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return toSeconds(endTime)-toSeconds(startTime);
    }
    private int toSeconds(String time){
        String[] parts = time.split(":");
        int hours=Integer.parseInt(parts[0]);
        int min=Integer.parseInt(parts[1]);
        int sce=Integer.parseInt(parts[2]);
        return hours*3600+min*60+sce;
    }
}