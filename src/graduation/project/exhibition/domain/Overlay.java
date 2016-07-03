package graduation.project.exhibition.domain;

public class Overlay extends BaseDomain {

	public Overlay() {
		
		tableName = "overlay";
		tableRows = new String[] { "id","mapid", "comid","type", "x" , "y"  };
	}

}
