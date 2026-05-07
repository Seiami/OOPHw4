package edu.oop.guild.log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuildLog {
	
	private static GuildLog guildLog = null;
	private ArrayList<String> entryLog = null;
	
	private GuildLog() {
		entryLog = new ArrayList<>();
	}

	public static GuildLog getInstance() {
		if(guildLog == null) {
			guildLog = new GuildLog();
		}
		return guildLog;
	}

	public int size() {
		return entryLog.size();
	}

	public void clear() {
		entryLog.clear();
	}
	
	public void record(String s) {
		if(s == null) throw new NullPointerException();
		entryLog.add(s);
	}

	public List<String> entries() {
		// gross icky yuck
		return Collections.unmodifiableList(entryLog);
	}


}
