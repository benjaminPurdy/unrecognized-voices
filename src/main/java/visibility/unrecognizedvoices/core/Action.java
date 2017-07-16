package visibility.unrecognizedvoices.core;

import com.fasterxml.jackson.annotation.*;
import org.glassfish.jersey.server.*;
import org.joda.time.*;

/**
 * Created by benjaminpurdy on 12/14/16.
 */
public class Action implements Comparable<Action>{
	 public Action() {}

	@JsonProperty
	private DateTime dateTime;
	@JsonProperty
	private String description;

	public DateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(DateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Action{" + "dateTime=" + dateTime + ", description='" + description + '\'' + '}';
	}

	@Override
	public int compareTo(Action other) {
		if (dateTime.isBefore(other.getDateTime()))
			 return  0;
		return 1;
	}
}
