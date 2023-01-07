import java.util.LinkedList;

public class CourseSessions<T> extends LinkedList<T> {

    public CourseSessions() {
        super();
    }

    public void addSession(T session) {
        if (this.size() < 36) {
            this.add(session);
        }
    }

    public LinkedList<T> getSessions() {
        return this;
    }

    public void setSessions(LinkedList<T> sessions) {
        this.addAll(sessions);
    }

    public void removeSession(T session) {
        this.remove(session);
    }
}
