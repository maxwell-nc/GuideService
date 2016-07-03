package graduation.project.exhibition.domain;

public class Ad extends BaseDomain {

	public Ad() {
		tableName = "ad";
		tableRows = new String[] {  "id", "name", "size", "price", "pics"};
	}
	
}
