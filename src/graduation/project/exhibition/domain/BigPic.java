package graduation.project.exhibition.domain;

public class BigPic extends BaseDomain {

	public BigPic() {
		tableName = "info_big_pic";
		tableRows = new String[] { "id","text", "pic" };
	}

}
