package lastTest.finla_exam;

import java.util.ArrayList;

public class MovieSeries implements Media {
    double sum = 0;
    ArrayList<Movie> movies;
    String name;
    int year;
    double discountRate;

    public MovieSeries(String name, int year, double discountRate){

        this.name = name;
        this.year = year;
        this.discountRate = discountRate;
        movies = new ArrayList<>();
        System.out.printf("MovieSeries 영화 시리즈 %s Movie Series 생성, 할인율:%g\n",name,discountRate);
    }

    @Override
    public boolean equals(Object obj) {
        MovieSeries movieSeries = (MovieSeries) obj;
        if(this.name == movieSeries.name && this.year == movieSeries.year){
            return true;
        }else{
            return false;
        }
    }

    public void add(Movie movie){

        if(movies.contains(movie)){
            int index = movies.indexOf(movie);
            movies.remove(movies.get(index));
            movies.add(movie);
            System.out.printf("MovieSeries: 영화 %s 가(이) 변경되었습니다.\n",movie.movieName);

        }
        System.out.printf("MovieSeries: 영화 %s 가(이) 추가되었습니다.\n",movie.movieName);
        movies.add(movie);
    }

    public void remove(Movie movie){
        movies.remove(movie);
    }

    public void list(){

        System.out.printf("시리즈 %s 에 존재하는 영화\n",name);

        for(Movie movie : movies){
            System.out.println(movie);
        }
    }



    public Movie getMovie(int index){
        return movies.get(index);
    }


    public double getSumPrice(){

        for(Movie movie: movies){
            sum += movie.price;
        }
        double result = sum - sum*discountRate;

        return result;
    }

    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("시리즈"+name+"에 존재하는 영화\n");

        for(Movie movie: movies){
            stringBuilder.append(movie.toString());
        }

        stringBuilder.append("총 가격 "+getSumPrice() + "할인이 적용된 가격입니다");

        return stringBuilder.toString();
    }



}
