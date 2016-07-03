package graduation.project.exhibition.domain;

/**
 * 用户信息
 */
public class Weather extends BaseDomain {

	public Weather() {
		tableName = "weather_info";
		tableRows = new String[] { "time", "weather", "tem", "type" };
	}

}
