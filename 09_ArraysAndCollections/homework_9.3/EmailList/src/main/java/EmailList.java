import org.apache.commons.collections.list.TreeList;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    private final TreeSet<String> treeSet = new TreeSet<>();
    Pattern p = Pattern.compile("([A-z]+)@([A-z]+)\\.([a-z]+)");

    public void add(String email) {
        Matcher m = p.matcher(email.toLowerCase(Locale.ROOT));
        if (!m.matches() || treeSet.contains(email.toLowerCase(Locale.ROOT))) {
            System.out.println("Неверный формат email");
        } else {
            treeSet.add(email);
            System.out.println("Добавлен email" + email);
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(treeSet);
    }

}
