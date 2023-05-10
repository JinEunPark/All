package lastTest.finla_exam;

public class Movie implements Media{
    String movieName;
    int productionYear;
    int price;
    String quality;

    public Movie(String name, int productionYear, int price, String quality){

        this.movieName = name;
        this.productionYear = productionYear;
        this.price = price;
        this.quality = quality;
    }

    public String getName(){
        return this.movieName;
    }

    public int getProductionYear(){
        return this.productionYear;
    }

    @Override
    public String toString(){
        return "영화이름: "+movieName+" 영화대여 가격: "+ price + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Movie movie = (Movie) obj;
        if(this.movieName == movie.movieName && this.price == movie.price){
            return true;
        }else{
            return false;
        }
    }
}
