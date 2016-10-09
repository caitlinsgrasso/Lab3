package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {
	private UUID TableID;
	private ArrayList<Player> TablePlayers;

	public Table(UUID tableID, ArrayList<Player> tablePlayers) {
		super();
		TableID = tableID;
		TablePlayers = tablePlayers;
	}

	public UUID getTableID() {
		return TableID;
	}

	public ArrayList<Player> getTablePlayers() {
		return TablePlayers;
	}

	public void setTablePlayers(ArrayList<Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}
}
