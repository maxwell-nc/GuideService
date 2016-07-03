package graduation.project.exhibition.domain;

public class ActivitiesDetail extends BaseDomain {

	public ActivitiesDetail() {
		tableName = "activities_detail";
		tableRows = new String[] { "id","title", "tag1", "tag2", "pic", "time",
				"addr", "text" , "price" };
	}
}
