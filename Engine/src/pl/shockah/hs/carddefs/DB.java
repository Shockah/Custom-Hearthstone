package pl.shockah.hs.carddefs;

import java.util.ArrayList;
import java.util.List;
import pl.shockah.json.JSONObject;

public final class DB {
	public static DB parse(JSONObject j) {
		
	}
	
	public final String tag, name;
	public final List<CardDef> cards = new ArrayList<>();
	
	public DB(String tag, String name) {
		this.tag = tag;
		this.name = name;
	}
	
	public void setup() {}
}