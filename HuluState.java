public class HuluState implements State {

    public void pressHomeButton() {

        System.out.println("Loading the Home Screen..."); 
    }

    public void pressNetflixButton() {

        System.out.println("Loading Netflix..."); 
    }

    public void pressHuluButton() {

        System.out.println("We are already in Hulu..."); 
    }

    public void pressMovieButton() {

        String [] movies = {"The Missing Link", "Creed II", "The Lego Movie 2", "Napoleon Dynamite", "Parasite"}; 

        for(int i = 0; i < 5; i++){

            System.out.println(movies[i]); 
        }
    }

    public void pressTVButton() {

        String [] shows = {"Solar Opposites", "Bob's Burgers", "Seinfeld", "Kitchen Nightmares", "Drunk History"}; 

        for(int i = 0; i < 5; i++){

            System.out.println(shows[i]); 
        }
    }
    
}
