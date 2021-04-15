public class NetflixState implements State{

    public void pressHomeButton() {

        System.out.println("Loading the Home Screen..."); 
    }

    public void pressNetflixButton() {

        System.out.println("We are already in Netflix..."); 
    }

    public void pressHuluButton() {

        System.out.println("Loading Hulu..."); 

    }

    public void pressMovieButton() {

        String [] movies = {"Moonrise Kingdom", "Shorts", "About Time", "Scott Pilgrim VS The World", "ParaNorman"}; 

        for(int i = 0; i < 5; i++){

            System.out.println(movies[i]); 
        }
    }

    public void pressTVButton() {

        String [] shows = {"Community", "Love, Death, Robots", "Glee", "The Circle", "Gilmore Girls"}; 

        for(int i = 0; i < 5; i++){

            System.out.println(shows[i]); 
        }
    }


    
}
