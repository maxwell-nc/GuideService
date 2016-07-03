package graduation.project.exhibition.domain;

public class WebProduct extends BaseDomain {

	public WebProduct() {
		tableName = "web_product";
		tableRows = new String[] { "pd_no", "pd_fk_com_no", "pd_name", "pd_img", "pd_desc", "pd_content", "pd_price" };
	}
	
}
