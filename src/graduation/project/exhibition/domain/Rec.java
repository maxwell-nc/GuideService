package graduation.project.exhibition.domain;

public class Rec extends BaseDomain {

	public Rec() {
		tableName = "info_rec";
		tableRows = new String[] {  "id","pic", "title", "text", "praise" , "comment"};
	}

}
