package graduation.project.exhibition.domain;

public class Feedback extends BaseDomain {

	public Feedback() {
		tableName = "feedback";
		tableRows = new String[] {"id", "usercode", "text", "repeat"};
	}
	
}
