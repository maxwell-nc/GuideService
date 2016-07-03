package graduation.project.exhibition.domain;

public class Product extends BaseDomain {

	public Product() {
		tableName = "product";
		tableRows = new String[] {  "id",  "comid","title", "pic",  "text",  "price"};
	}
	
}
