import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class Book {
	private String name;
	private String author;
	private String genre;
	private double rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Book(String name, String author, String genre, Double rating) {
		super();
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", genre=" + genre + ", rating=" + rating + "]";
	}
	
	
}

public class CustomSpliterator {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\nisch\\Downloads\\Books.txt");
		Stream<String> s = Files.lines(path);
		Spliterator<String> r = s.spliterator();
		Spliterator<Book> rr= new BookSpliterator(r); 
		
		Stream<Book> srr=StreamSupport.stream(rr,false);
		
		srr.forEach((book) -> System.out.println(book));
		
	}
}
