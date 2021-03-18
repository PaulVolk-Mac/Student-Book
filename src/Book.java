

public class Book {
        private String title;
        private String id;

    public Book(){

    }

    public Book(String title, String id) { // 2 attributes now
        this.title = title;
        this.id = id;

    }
    @Override
    public String toString() {
        return title + " " + "(" + id + ")";

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }







        public String getBookData() { // lets try to imp
            return title+ " " +   "(" + id + ")" ;


    }




public void updateBook(String title, String id){
    this.title = title;
    this.id = id;


}
public void getInfoBook(){

}
public void deleteBook(){

}
    }
