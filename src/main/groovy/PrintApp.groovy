import io.getstream.models.App;

class PrintApp {
    static void main(String[] args) {
        println App.get().request()
    }
}
