public class MainPageLayout {
    public static void main(String[] args) {
        String layout = "<html><head><title>Dusty Shelf Book Inventory</title></head>";
        layout += "<body><h1>Welcome to Dusty Shelf Inc.</h1>";
        layout += "<div id='menu'><ul><li><a href='/books'>View Books</a></li>";
        layout += "<li><a href='/addBook'>Add Book</a></li></ul></div>";
        layout += "</body></html>";

        System.out.println(layout);
    }
}
