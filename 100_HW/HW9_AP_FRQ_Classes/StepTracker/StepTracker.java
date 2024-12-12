import java.util.*;

public class stepTracker {
    int totalSteps = 0;
    int entrees = 0; 
    int dailySteps = 0;
    int activeDays = 0;
    
    public stepTracker(){
        totalSteps = 0;
        entrees = 0;
        activeDays = 0;
    }
    public stepTracker(step){
        totalSteps = totalSteps + steps;
        entrees++;
        if (step >= 10000){
            activeDays++;
        }
    }
    public void addDailySteps(int dailySteps){
        totalSteps = totalSteps + dailySteps;
        entrees++;
        if (dailySteps >= 10000){
            activeDays++;
        }
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        return (double)totalSteps/entrees;
    }
    
}