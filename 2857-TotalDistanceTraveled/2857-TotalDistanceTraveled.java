// Last updated: 8/11/2026, 2:15:22 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int totalFuelUsed = 0;
        while (mainTank >= 5) {
            mainTank -= 5;
            totalFuelUsed += 5;
            if (additionalTank >= 1) {
                additionalTank--;
                mainTank += 1;
            }
        }
        totalFuelUsed += mainTank;
        return totalFuelUsed * 10;
    }
}