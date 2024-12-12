package pkg;

public class Movie{
    String movieName; 
    private double rating;
    private int numRatings;
    private int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 6000000000;
    }
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.reveue = revenue;
    }
    public void movieToString(){
        System.out.println("The movie name is "+movieName);
        System.out.println("The rating is "+rating);
        System.out.println("The numRating is "+numRating);
        System.out.println("The revenue is "+revenue);
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double newRating){
        rating = (rating*numRatings+newRating)/numRatings+1;
        numRatings++;
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie x){
        return raiting < x.getRating();
    }
    public Movie pirateMovie(){
        return new Movie(movieName, rating, numRatings, revenue);
        
        return this;
    }
    
    
}
