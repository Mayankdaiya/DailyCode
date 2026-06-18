class Solution {
    public double angleClock(int hour, int minutes) {
        double angleh , anglem;
        anglem = (minutes / 60.0)*360.0;
        angleh = (hour / 12.0)*360.0 + (minutes / 60.0)*30.0;
        angleh %= 360;
        return Math.min(Math.abs(anglem-angleh),(360 - Math.max(anglem,angleh)+Math.min(anglem,angleh)));
    }
}