package graduation.project.exhibition.domain;

public class Hall extends BaseDomain {

	public Hall() {
		tableName = "hall";
		tableRows = new String[] { "id","type", "title" , "text", "pic", "isRec"};
	}

}

