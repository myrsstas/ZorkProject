package zorkproject.Classes;

import java.util.Date;

/**
 * Created by paulkokos on 29/3/2017.
 *
 */
public class Time {
    private final Date createdDate = new java.util.Date();

    public int getAgeInSeconds() {
        java.util.Date now = new java.util.Date();
        return (int) ((now.getTime() - this.createdDate.getTime()) / 1000);
    }

}
