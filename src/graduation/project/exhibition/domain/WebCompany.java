package graduation.project.exhibition.domain;

public class WebCompany extends BaseDomain {

	public WebCompany() {
		tableName = "web_company";
		tableRows = new String[] { "com_no", "com_name", "com_desc", "com_img", "com_addr", "com_phone"};
	}
	
}
