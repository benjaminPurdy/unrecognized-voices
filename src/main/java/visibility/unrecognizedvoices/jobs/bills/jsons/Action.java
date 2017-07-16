package visibility.unrecognizedvoices.jobs.bills.jsons;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class Action {

	public Action() {
	}

	private Date datetime;
	private String description;

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Action{" + "datetime=" + datetime + ", description='" + description + '\'' + '}';
	}
}
