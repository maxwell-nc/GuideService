package graduation.project.exhibition.domain;

public class ProductDetails extends BaseDomain {

	public ProductDetails() {
		tableName = "product_detial";
		tableRows = new String[] {  "id", "star", "addr",  "key1", "key2", "key3", "key4", "special" };
	}
}
