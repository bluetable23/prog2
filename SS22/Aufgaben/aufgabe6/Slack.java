package aufgabe6;

import java.util.*;

public class Slack implements Publisher {

	private Set<Listener> listeners;
	private int nrOfMessages;

	public Slack() {
		this.listeners= new HashSet<>();
		this.nrOfMessages = 0;

	}

	@Override
	public boolean register(Listener listener) {

		return listeners.add(listener);

	}

	@Override
	public boolean unregister(Listener listener) {
		return listeners.remove(listener);

	}

	@Override
	public void notifyListeners() {
		Iterator<Listener> it = listeners.iterator();
		while (it.hasNext()) {
			it.next().update();
		}
	}

	@Override
	public String getUpdate(Listener listener) {
		String s = ("Breaking News: " + this.nrOfMessages);
		return s;
	}

	public void publishNews() {

		this.nrOfMessages = +1;
		notifyListeners();
	}

}
