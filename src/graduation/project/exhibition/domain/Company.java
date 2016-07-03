package graduation.project.exhibition.domain;

public class Company extends BaseDomain {

	public Company() {
		tableName = "home_company";
		tableRows = new String[] {  "id", "title", "pic",  "text"};
	}
	
}
