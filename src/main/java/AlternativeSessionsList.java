import java.util.LinkedList;

public class AlternativeSessionsList<T> extends LinkedList<T> {

        public AlternativeSessionsList() {
            super();
        }

        public void addSession(T session) {
            this.add(session);
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
