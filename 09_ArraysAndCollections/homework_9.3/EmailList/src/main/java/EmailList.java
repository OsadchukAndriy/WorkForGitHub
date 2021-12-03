import org.apache.commons.collections.list.TreeList;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    private final TreeSet<String> treeSet = new TreeSet<>();

    public void add(String email) {
        Pattern p = Pattern.compile("([A-z]+)@([A-z]+)\\.([a-z]+)");
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
