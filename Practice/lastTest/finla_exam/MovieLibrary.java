package lastTest.finla_exam;

import java.util.ArrayList;

public class MovieLibrary implements Media {

    ArrayList<MovieSeries> movieSeries;
    ArrayList<Movie> movies;

    String movieLibraryName;
    boolean replace;

    public MovieLibrary(String movieLibraryName) {
        this.movieLibraryName = movieLibraryName;
        movies = new ArrayList<>();
        movieSeries = new ArrayList<>();
    }

    public void insert(Media movie, boolean replace) {


            if (movie instanceof Movie) {
                Movie realM = (Movie) movie;
                movies.add(realM);
                System.out.printf("MovieLibrary : %d 년도에 제작된 영화 %s가 추가 되었습니다\n",realM.productionYear,realM.movieName);
            }

            if (movie instanceof MovieSeries) {
                MovieSeries movieSeries1 = (MovieSeries)movie;

                movieSeries.add(movieSeries1);
                System.out.printf("MovieLibrary : %d 년도에 제작된 영화 %s가 추가 되었습니다\n",movieSeries1.year,movieSeries1.name);

            }

    }

    public void delete(Media movie) {
        if (movie instanceof Movie) {
            movies.remove((Movie) movie);
        }

        if (movie instanceof MovieSeries) {
            movieSeries.remove((MovieSeries) movie);
        }


    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(movieLibraryName + "에 존재하는 영화시리즈 \n");

        for(Movie movie: movies){
            stringBuilder.append(movie.toString());
        }

        for(MovieSeries movieSeries: movieSeries){
            stringBuilder.append(movieSeries.toString());
        }
        stringBuilder.append("영화 갯수: "+movies.size());
        stringBuilder.append("영화 시리즈 갯수: "+movieSeries.size());

        double result = 0;

        for(MovieSeries movieSeries: movieSeries){
            result += movieSeries.getSumPrice();
        }

        for(Movie movie: movies){
            result += movie.price;
        }

        stringBuilder.append("전채가격 :"+result);

        return stringBuilder.toString();
    }


}
