package graduation.project.exhibition.domain;

public class DiscoverDetails extends BaseDomain {

	public DiscoverDetails() {
		tableName = "discover";
		tableRows = new String[] {  "id", "count", "addr",  "express", "discount", "distime", "special" , "text"};
	}
}