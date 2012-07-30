/**
 * 
 */
package org.icm.dao;

import java.util.Collection;
import java.util.HashMap;

import org.icm.model.EventMaster;

/**
 * @author nageswararao.vejja
 *
 */
public interface IEventsDao {
	
	int addEvent(EventMaster event);
	
	int updateEvent(EventMaster event);
	
	EventMaster getEvent(int id);
	
	Collection<EventMaster> getEvents(HashMap<String, String> map);
	
	int deleteEvent(int id);

	Collection<EventMaster> getEvents(String Keyword);

}
