package graduation.project.exhibition.domain;

public class NewsDetail extends BaseDomain {

	public NewsDetail() {
		tableName = "info_news_detail";
		tableRows = new String[] {"id", "title", "time", "link", "pic1", "pic2", "pic3", "text"};
		
	}

}
