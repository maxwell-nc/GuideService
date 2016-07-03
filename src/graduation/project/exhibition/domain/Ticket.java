package graduation.project.exhibition.domain;

public class Ticket extends BaseDomain {

	public Ticket() {
		tableName = "ticket";
		tableRows = new String[] {  "id", "name", "time", "no1", "no2", "addr" , "pic"};
	}
}
