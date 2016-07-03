package graduation.project.exhibition.domain;

public class Activities extends BaseDomain {

	public Activities() {
		tableName = "info_activities";
		tableRows = new String[] { "id","pic", "title", "state", "time", "addr",
				"price", "text" };
	}

}
