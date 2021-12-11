
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> mapPhoneBook = new TreeMap<>();
    Set<String> setPhoneBook = new TreeSet<>();

    public void addContact(String phone, String name) {
        if (phone.matches("[0-9]{11}") && name.matches("[А-Яа-я]+")) {
            if (mapPhoneBook.containsKey(phone)) {
                mapPhoneBook.replace(phone, mapPhoneBook.get(phone), name);
            } else {
                mapPhoneBook.put(phone, name);
            }
        }
        // проверьте корректность формата имени и телефона (отдельные методы для проверки)
        // если такой номер уже есть в списке, то перезаписать имя абонента
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
            // формат одного контакта "Имя - Телефон"
            // если контакт не найден - вернуть пустой TreeSet
            return new TreeSet<>();
        }
    }

    public Set<String> getAllContacts() {

        for (String key : mapPhoneBook.keySet()) {
            setPhoneBook.add(mapPhoneBook.get(key) + " - " + key);
        }
        if (!setPhoneBook.isEmpty()) {
            return setPhoneBook;
        } else {
            return new TreeSet<>();
        }
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
