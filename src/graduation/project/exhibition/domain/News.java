package graduation.project.exhibition.domain;

public class News extends BaseDomain {

	public News() {
		tableName = "info_news";
		tableRows = new String[] {"id", "pic", "title", "text", "url", "readcount"};
	}

}
