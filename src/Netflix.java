
public class Netflix {
	public static void main(String[] args) {
		Movie miles = new Movie("Spider-man: Into the Spider-Verse", 5);
		Movie thanos = new Movie("Avengers: Infinity War", 3);
		Movie iron = new Movie("Iron Man", 2);
		Movie potter = new Movie("Harry Potter and the Sorcerer's Stone", 4);
		Movie spidey = new Movie("Spiderman: Homecoming", 1);
		System.out.println(miles.getTicketPrice());
		NetflixQueue nq = new NetflixQueue();
		nq.addMovie(miles);
		nq.addMovie(thanos);
		nq.addMovie(iron);
		nq.addMovie(potter);
		nq.addMovie(spidey);
		nq.printMovies();
		System.out.println("The best movie is " + nq.getBestMovie() + ".");
		System.out.println("The second best movie is " + nq.getMovie(1) + ".");
	}
}
