package visibility.unrecognizedvoices.core;

import java.util.*;

/**
 * Created by benjaminpurdy on 12/14/16.
 */
public class Committee {
	public Committee() { }

	private String name;
	private Date beginDate;
	private Date endDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Committee{" + "name='" + name + '\'' + ", beginDate=" + beginDate + ", endDate=" + endDate + '}';
	}
}
