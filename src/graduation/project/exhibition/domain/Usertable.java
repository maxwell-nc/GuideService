package graduation.project.exhibition.domain;

/**
 * 用户信息
 */
public class Usertable extends BaseDomain {

	public Usertable() {
		tableName = "usertale";
		tableRows = new String[] { "username", "pass" };
	}

}
