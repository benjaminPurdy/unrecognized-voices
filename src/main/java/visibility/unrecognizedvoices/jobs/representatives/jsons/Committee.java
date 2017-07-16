package visibility.unrecognizedvoices.jobs.representatives.jsons;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class Committee {

	public Committee() { }

	private String name;
	private String code;
	private String apiUri;
	private int rankInParty ;
	private Date beingDate;
	private Date endDate;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getApiUri() {
		return apiUri;
	}

	@JsonProperty("api_uri")
	public void setApiUri(String apiUri) {
		this.apiUri = apiUri;
	}

	public int getRankInParty() {
		return rankInParty;
	}

	@JsonProperty("rank_in_party")
	public void setRankInParty(int rankInParty) {
		this.rankInParty = rankInParty;
	}

	public Date getBeingDate() {
		return beingDate;
	}

	@JsonProperty("begin_date")
	public void setBeingDate(Date beingDate) {
		this.beingDate = beingDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	@JsonProperty("end_date")
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Committee{" + "name='" + name + '\'' + ", code='" + code + '\'' + ", apiUri='" + apiUri + '\'' + ", rankInParty=" + rankInParty + ", beingDate=" + beingDate + ", endDate=" + endDate + '}';
	}
}
