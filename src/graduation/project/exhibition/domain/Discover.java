package graduation.project.exhibition.domain;

public class Discover extends BaseDomain {

	public Discover() {
		tableName = "discover";
		tableRows = new String[] {  "id", "type", "pic", "title", "star", "spend" , "text","near",  "title_tap", "text_tap", "add_text"};
	}
	
}
