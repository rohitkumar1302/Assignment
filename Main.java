import java.util.ArrayList;

class Book{

    int BookId;
    String BookName;
    String AthorName;

    Book(int  BookId,String BookName ,String AthorName){
        System.out.println("bookname : " + BookName + "  bookid : " + BookId + " athorName : " + AthorName);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> obj = new ArrayList<Book>();

        obj.add(new Book(345, "nobel", "mankis"));
        
    }
    
}
