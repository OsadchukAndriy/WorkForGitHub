import java.util.ArrayList;

public class TodoList {
    ArrayList todoList = new ArrayList();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело: " + todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        // попробую без for
        for (int i = 0; i < todoList.size(); i++) {
            if (index <= todoList.size()) {
                todoList.add(index, todo);
            } else {
                todoList.add(todo);
            }
            System.out.println("Добавлено дело: " + todo + "На место: " + index);
            break;
        }

    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index < 0 || index + 1 > todoList.size()) {
            System.out.println("Невозможно добавить дело с таким индексом");
    } else {
            todoList.set(index, todo);
        System.out.println("Отредактировано: " + todoList + "На место: " + index);
    }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index < 0 || index + 1 > todoList.size()) {
            System.out.println("Невозможно удалить дело с таким индексом");
        } else {
            todoList.remove(index);
        }
    }

    public ArrayList<String> getTodos() {

        // TODO: вернуть список дел
        return todoList;
    }

}