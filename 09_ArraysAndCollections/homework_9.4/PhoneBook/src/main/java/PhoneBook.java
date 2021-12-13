
import antlr.collections.List;

import java.lang.reflect.Array;
import java.util.*;

public class PhoneBook {
    Map<String, String> mapPhoneBook = new HashMap<>();
    Set<String> setPhoneBook = new TreeSet<>();

    public void addContact(String phone, String name) {
        if (phone.matches("[0-9]{11}") && name.matches("[А-Яа-я]+")) {
            if (mapPhoneBook.containsKey(phone)) {
                mapPhoneBook.replace(phone, mapPhoneBook.get(phone), name);
            } else {
                mapPhoneBook.put(phone, name);
            }
        }
    }

    public String getContactByPhone(String phone) {
        if (mapPhoneBook.containsKey(phone)) {
            return mapPhoneBook.get(phone) + " - " + phone;
        } else {
            return "";
        }
    }

    public Set<String> getContactByName(String name) {
        String nameTel = "";
        if (mapPhoneBook.containsValue(name)) {
            nameTel = nameTel.concat(name) + " - ";
            for (String tel : mapPhoneBook.keySet()) {
                if (mapPhoneBook.get(tel).equals(name)) {
                    nameTel = nameTel.concat(tel) + ", ";
                }
            }
            setPhoneBook.add(nameTel.substring(0, nameTel.length() - 2));
            return setPhoneBook;
        } else {
            return new TreeSet<>();
        }
    }

    public Set<String> getAllContacts() {
        Map<String, Set<String>> treeMap = new TreeMap<>();
        TreeSet<String> result = new TreeSet<>();
        if (!mapPhoneBook.isEmpty()) {
            for (Map.Entry<String, String> entry : mapPhoneBook.entrySet()) {
                String phone = entry.getKey();
                String name = entry.getValue();
                if (treeMap.containsKey(name)) {
                    treeMap.get(name).add(phone);
                } else {
                    Set<String> temp = new TreeSet<>();
                    temp.add(phone);
                    treeMap.put(name, temp);
                }
            }
            for (Map.Entry<String, Set<String>> entry : treeMap.entrySet()) {
                result.add(entry.getKey() + " - " + String.join(", ", entry.getValue()));
            }
            return result;
        }
        return new TreeSet<>();
    }
}
// для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
// это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
