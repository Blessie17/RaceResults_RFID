package com.fr.bless.race.main;

public class TimeDuration {
	int noOfSeconds;
	public TimeDuration()
	{}
	public TimeDuration(int numOfSeconds)
	{super();
	if( numOfSeconds < 0 )
		try {
			throw new Exception("Bad value Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    System.out.println("Number of Seconds " + numOfSeconds);
		this.noOfSeconds=numOfSeconds;
	}
	@Override
	public String toString() {
		int hours = (int) noOfSeconds / 3600;
	    int temp = (int) noOfSeconds - hours * 3600;
	    int mins = temp / 60;
	    temp = temp - mins * 60;
	    int secs = temp;
	    int[] timeDuration = {hours , mins , secs};
		return " " + timeDuration[0]
				+ "h" + timeDuration[1] + "m" + timeDuration[2] + "s";
	}
}
