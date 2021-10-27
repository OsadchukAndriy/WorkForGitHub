public class Printer {
    public String queue = "";
    public String name = "";
    public int pendingPagesCount = 0;
    public int allTimePrintedPages = 0;

    public void append(String text){
        append("text","text");
    }
    public void append(String text, String name){
        append("text","text", 0);
    }
    public void append(String text, String name, int count){
        queue = queue + "\n" + text + " - " + name + " - " + count + "Стрпниц.";
        pendingPagesCount = pendingPagesCount + count;
        allTimePrintedPages = allTimePrintedPages + count;
    }
    public int getPendingPagesCount(){
        return pendingPagesCount;
    }
    public int getAllTimePrintedPages(){
        System.out.println(allTimePrintedPages);
        return allTimePrintedPages;
    }
    public void clear(){
        queue = "";
    }
    public void print(){
        if(queue.isEmpty()){
            System.out.println("Нет документов на печать");
        } else {
            System.out.println(queue);
            pendingPagesCount = 0;
            clear();
        }
    }
}
