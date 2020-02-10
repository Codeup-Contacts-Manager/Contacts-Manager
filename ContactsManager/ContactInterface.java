package ContactsManager;

import java.util.List;

public interface ContactInterface {
    List <Getnames> all();
    List <Getnames> search (String searchTerm);
    void add (Getnames Getnames);
    void remove (Getnames Getnames );
}
