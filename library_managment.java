class library{
    String[] books;
    int NoOfBooks;
   library(){

       NoOfBooks=0;
       this.books= new String[100];
   }
    void addbook(String book){
        this.books[NoOfBooks]=book;
        NoOfBooks++;
        System.out.println(book+" is added");
    }
    void availablebooks(){
        System.out.println("available books");
           for (String element : books) {
                 if (element!=null) {
                     System.out.println(element);
                 }
       }
    }
    void issuebook (String book){
       for (int i=0; i< books.length; i++){
           if (books[i].equals(book)){
               System.out.println("book is issued");
               books[i]=null;
               return;
           }
       }
        System.out.println("book not exist library");
    }
    void returnbook(String book){
       addbook(book);
    }
}
public class library_managment {
    public static void main(String[] args) {
        library lb=new library();
        lb.addbook("book1");
        lb.addbook("book2");
        lb.availablebooks();
        lb.issuebook("book1");
        lb.availablebooks();
    }
}