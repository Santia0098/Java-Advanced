package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * This method get the exact time to start visualization
	 * @param dateI is an objet {@code Date} with exact time
	 * 
	 * @return return time and date
	 * {@inheritDoc}
	 */
	Date startToSee(Date dateI);
	
	/**
	 * This method get the exact time to start visualization
	 * @param dateI is an objet {@code Date} with start exact time
	 * @param dateF is an objet {@code Date} with end exact time
	 * {@inheritDoc}
	 */
	void stopToSee(Date dateI, Date dateF);
	
}
