public class HomeState implements State{

    private TV tv; 

    public void pressHomeButton() {

        System.out.println("TV is already on the Home Screen..."); 
    }

    public void pressNetflixButton() {

        System.out.println("Loading Netflix..."); 
        tv.setNetflixState(tv.getNetflixState());
    }

    public void pressHuluButton(){

        System.out.println("Loading Hulu..."); 
        tv.setHuluState(tv.getHuluState());
    }

    public void pressMovieButton() {

        System.out.println("You must pick an app to show movies...");
    }

    public void pressTVButton() {

        System.out.print("You must pick an app to show tv shows..."); 
    }
    
}
