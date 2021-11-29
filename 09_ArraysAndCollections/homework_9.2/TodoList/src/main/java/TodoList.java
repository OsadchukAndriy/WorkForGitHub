import java.util.ArrayList;

public class TodoList {
    ArrayList todoList = new ArrayList();

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено дело: " + todo);
    }

    public void add(int index, String todo) {
        if (index <= todoList.size()) {
            todoList.add(index, todo);
        } else {
            todoList.add(todo);
        }
        System.out.println("Добавлено дело: " + todo + "На место: " + index);

    }

    public void edit(String todo, int index) {
        if (index < 0 || index + 1 > todoList.size()) {
            System.out.println("Невозможно добавить дело с таким индексом");
        } else {
            todoList.set(index, todo);
            System.out.println("Отредактировано: " + todoList + "На место: " + index);
        }
    }

    public void delete(int index) {
        if (index < 0 || index + 1 > todoList.size()) {
            System.out.println("Невозможно удалить дело с таким индексом");
        } else {
            todoList.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        return todoList;
    }

}